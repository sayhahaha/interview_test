package test;

import java.util.Arrays;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 10:48:46 AM  
*/
public class FindKminNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<str.length;i++)
		   arr[i] = Integer.valueOf(str[i]);
		int temp []=findKminNum(arr);
		for(int i=0;i<arr[arr.length-1]-1;i++)
			System.out.print(temp[i]+ " ");
		System.out.print(temp[arr[arr.length-1]-1]);
	}

	public static int[] findKminNum(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int temp[]=new int[len-1];
		for(int i=0;i<temp.length;i++)
			temp[i]=arr[i];
		Arrays.sort(temp);
		return temp;
	}

}
