package test;

import java.util.Scanner;
import java.util.Stack;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 17, 2017 11:32:13 AM 
* @version 1.0   
*/
public class MaxInnerRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(maxInnerRec(arr,n));
	}

	public static int maxInnerRec(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 0;
		int max=0;
		Stack <Integer>stk = new Stack <Integer>();
		for(int i=0;i<n;i++)
		{
			while(!stk.isEmpty() && arr[stk.peek()]>=arr[i])
			{
				int curIndex=stk.pop();
				int left=stk.isEmpty()?-1:stk.peek();
				int curArea = (i-left-1)*arr[curIndex];
				max=Math.max(max, curArea);				
			}
			stk.push(i);
		}
		while(!stk.isEmpty())
		{
			int curIndex=stk.pop();
			int left=stk.isEmpty()?-1:stk.peek();
			int curArea=(n-left-1)*arr[curIndex];
			max=Math.max(max, curArea);
		}
		return max;
	}

}
