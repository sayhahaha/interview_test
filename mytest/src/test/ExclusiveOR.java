package test;

import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Aug 20, 2017 3:32:18 PM  
*/
public class ExclusiveOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String A=new String();
		String B=new String();
		A=sc.nextLine();
		B=sc.nextLine();
		int n=A.length();
		System.out.println(exclusiveOR(A,B,n));
	}

	public static int exclusiveOR (String A,String B,int n)
	{
		char arr1[]=A.toCharArray();
		char arr2[]=B.toCharArray();
		int sum=0;
		for(int i=n-1;i>=0;i--)
		{
			if(arr1[i]!=arr2[i])
			{
				sum+=Math.pow(2, n-1-i);
			}
		}
		return sum;	
	}
}
