package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 11, 2017 10:25:49 AM 
* @version 1.0   
*/
public class SumOfSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]={{1,2,-3},{3,4,-5},{-5,-6,-7}};
		
		Scanner sc= new Scanner(System.in);		
		while(sc.hasNext())
		{
			int n= sc.nextInt();
			int arr[][]=new int [n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}			
			System.out.println(sumOfSubMatrix(arr,n));
		}
	}

	public static int sumOfSubMatrix(int a[][],int n)
	{
		int max=Integer.MIN_VALUE;
//		int temp[][]=a;
//		//temp 临时数组，当前行保存前i行的累加值
//		for(int i=1;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				temp[i][j]+=temp[i-1][j];
//			}
//		}
		
		//res保存的是从 i 行 到第 j 行 所对应的矩阵上下值的和 
		for(int i=0;i<n;i++)
		{
			int res[]=new int[n];
			for(int j=i;j<n;j++)
			{				
				for(int k=0;k<n;k++)
				{
					res[k]+=a[j][k];
				}
				int maxNum=sumOfSubArray(res);
				if(maxNum>max)
					max=maxNum;
			}
		}
		return max;		
	}
	
	public static int sumOfSubArray(int arr[])
	{
		if(arr.length==0||arr==null)
			return 0;
		int max=Integer.MIN_VALUE;
		int cur=0;
		for(int i=0;i<arr.length;i++)
		{
			cur+=arr[i];
			max=Math.max(max, cur);
			cur=cur<0?0:cur;
		}
		return max;		
	}
}
