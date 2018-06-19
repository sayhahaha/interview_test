package test;

import java.util.ArrayList;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Aug 25, 2017 2:45:38 PM  
*/
public class MaxInWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		int size = 9;
//		int num[]={2,3,4,2,6,2,5,7};
//		ArrayList<Integer> list =maxInWindows(num,size);
//		System.out.println(list);
		int sum=0;
		System.out.println(sum%5);
		
	}

	public static ArrayList<Integer> maxInWindows(int [] num, int size)
	{
		ArrayList <Integer> list = new ArrayList <Integer>();
		if(size==0 || size>num.length)
			return list;
		int right=size-1;
		int max=Integer.MIN_VALUE;
		max=maxValue(num,right,size);
		list.add(max);
		right++;
		while(right<num.length)
		{
			if(num[right]>max)
			{
				list.add(num[right]);
				max=num[right];
			}else{
				if(num[right-size]==max)
				{
					max=maxValue(num,right,size);
				}
				list.add(max);
			}
			right++;
		}
		return list;	        
	}
	public static int maxValue(int num[],int right,int size)
	{
		int max=Integer.MIN_VALUE;
		while(size>0)
		{
			max=Math.max(max, num[right]);
			size--;
			right--;
		}
		return max;
	}
}
