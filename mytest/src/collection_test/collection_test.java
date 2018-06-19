package collection_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 7, 2017 2:32:04 PM 
* @version 1.0   
*/
public class collection_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable <String , Double>ht = new Hashtable<>();
		ht.put("w", 2.0);
		int []a[]=new int[10][10];
		HashMap <String , Double>map=new HashMap <String , Double>();	
		map.put(null, 90.0);
		map.put("q", null);
		map.put("qq", null);
//		map.put("数学", 92.0);
//		map.put("英语", 79.0);
//		
//		Stack <String> stk= new Stack <String>();
//		stk.push("英语");
		
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("abc");
		arr.add("acb");
		
		 
		char c='A';
		System.out.println((int)c);
		System.out.println((-20) >>> 2);
		int i=Integer.valueOf("123");
		String str=String.valueOf(456);
		char data[] = {'a', 'b', 'c'};
		System.out.println(i);
		System.out.println(str);
		System.out.println(String.valueOf(data));
		System.out.println(Arrays.toString(data));
		System.out.println(data.toString());
		
	}

}
