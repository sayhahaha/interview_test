package test2;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/** 
* @author xxh 	
* @date 创建时间：Sep 7, 2017 7:42:01 PM  
*/
public class IPv4_IPv6_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[]{"172.16.254.01","256.256.256.256","10.12.12.255","2001:0db8:85a3:0:0:8A2E:0370:7334"};
		List<String> results = new LinkedList<String>();
		results=sol(str);
		System.out.print(results);
	}
	public static List<String> sol(String[] args) {	    
		List<String> results = new LinkedList<String>();	    	
		int count = args.length;
		for(int k = 0;k < count;k++){
			if(ipCheck(args[k]))
				results.add("IPv4");
			else if(isIPv6(args[k]))
				results.add("IPv6");
			else results.add("Neither");
		}    			
    	return results; 	
	}
    public static boolean isIPv4(String str){
    	if(!Pattern.matches("[0-9]*[.][0-9]*[.][0-9]*[.][0-9]*", str))
    	return false;
    	else {
    		String[] arrays = str.split("\\.");
    		
    		if(Integer.parseInt(arrays[0]) < 256 && arrays[0].length() <= 3
    			&&Integer.parseInt(arrays[1]) < 256 && arrays[0].length() <= 3
    			&&Integer.parseInt(arrays[2]) < 256 && arrays[0].length() <= 3
    		    &&Integer.parseInt(arrays[3]) < 256 && arrays[0].length() <= 3)
    			
    			return true;
    		
    		else return false;
    	}
    		
    }
    
    public static boolean isIPv6(String str){
    	String regex="^([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"	    						
					+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"
					+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"
	    			+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"
	    			+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"
	    			+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"
	    			+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])[:]"
	    			+ "([0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]|[0])$";	    	
    	if(!str.matches(regex))
    		return false;   	
    	return true;  
    }
    public static boolean ipCheck(String text) {
    	if (text != null && !text.isEmpty()) {
	    	// 定义正则表达式
	    	String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])[.]"
	    				+  "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
	    				+  "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
	    				+  "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
	    	// 判断ip地址是否与正则表达式匹配
	    	if (text.matches(regex)) {
	    		return true;
	    	}else {
	    		return false;
	    	}
    	}
    	return false;
    }
}
