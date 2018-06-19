package test;

import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Sep 12, 2017 4:06:16 PM  
*/
public class StringContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	String str1=sc.nextLine();
    	String str2=sc.nextLine();
    	System.out.println(str1ContainStr2(str1,str2));
	}

	public static boolean str1ContainStr2(String str1, String str2) {
		// TODO Auto-generated method stub
		int hash[]=new int[26];
		for(int i=0;i<str1.length();i++){
			hash[str1.charAt(i)-'A']++;
		}
		for(int j=0;j<str2.length();j++){
			if(hash[str2.charAt(j)-'A']==0)
				return false;
		}
		return true;
	}

}
