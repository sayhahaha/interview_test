package test;

import java.util.Arrays;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Aug 21, 2017 4:04:44 PM  
*/
public class SortOfMoveToTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(leastOfMoveTime(arr));
	}

	public static int leastOfMoveTime(int arr[])
	{
		int res=0;
		int n=arr.length;
		int oldArr[]=new int[n];
		for(int i=0;i<n;i++)
			oldArr[i]=arr[i];
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(oldArr[i]==arr[res])
				res++;
		}
		return n-res;
	}
}
