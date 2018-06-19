package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 11, 2017 3:22:39 PM 
* @version 1.0   
*/
public class maxSumOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(sumOfSubArray(a));
	}

	public static int sumOfSubArray(int[] a) {
		// TODO Auto-generated method stub
		int length=a.length;
		int max=Integer.MIN_VALUE;
		int cur=0;
		for(int i=0;i<length;i++)
		{
			cur+=a[i];
			max=Math.max(max, cur);
			cur=cur<0?0:cur;
		}		
		return max;
	}

}
