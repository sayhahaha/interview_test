package test;

import java.util.Arrays;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 5:15:18 PM  
*/
public class PrintMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();	
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println(printMinNumber(arr));
		}
	}

	public static String printMinNumber(int[] arr) {
		// TODO Auto-generated method stub
		String str[] =new String[arr.length];
		for(int i = 0; i < arr.length; i++)
			str[i] =String.valueOf(arr[i]);
		Mycompartor myComparetor =new Mycompartor();
		Arrays.sort(str, myComparetor);
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length; i++){
			sb. append(str[i]);
		}
		return sb.toString();
	}

}
