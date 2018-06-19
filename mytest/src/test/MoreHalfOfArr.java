package test;

import java.util.Arrays;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 11:11:18 AM  
*/
public class MoreHalfOfArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<str.length;i++)
		   arr[i] = Integer.valueOf(str[i]);
		Arrays.sort(arr);
		int len=arr.length;
		int temp = arr[len/2];
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(arr[i]==temp)
			{
				count++;
			}
		}
		if(count>=len/2)
			System.out.println(temp);
		else
			System.out.println(arr[len/2-1]);
	}

}
