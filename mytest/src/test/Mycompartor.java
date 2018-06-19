package test;

import java.util.Comparator;

/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 5:20:36 PM  
*/
public class Mycompartor implements Comparator <String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String s1=o1+o2;
		String s2=o2+o1;
		return s1.compareTo(s2);
	}





}
