package test;

import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Sep 4, 2017 9:39:50 PM  
*/
public class MaxTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while(sc.hasNext())
		{
			int  n =sc.nextInt();
			int temp[][]=new int[n][2];
			for(int i=0;i<n;i++)
			{
				temp[i][0]=sc.nextInt();
				temp[i][1]=sc.nextInt();
			}
			double maxArea=maxTriangle(temp);
			System.out.println(String.format("%.2f", maxArea));
		}
		sc.close();
	}

	public static double maxTriangle(int temp[][])
	{
		double max=0;
		int n=temp.length;
		for(int i=0;i<n;i++)
			for(int j=i;j<n;j++)
				for(int k=j+1;k<n;k++)
				{
					double a= Math.sqrt(Math.pow(temp[i][0]-temp[j][0], 2)+Math.pow(temp[i][1]-temp[j][1], 2));
					double b= Math.sqrt(Math.pow(temp[i][0]-temp[k][0], 2)+Math.pow(temp[i][1]-temp[k][1], 2));
					double c= Math.sqrt(Math.pow(temp[j][0]-temp[k][0], 2)+Math.pow(temp[j][1]-temp[k][1], 2));
					double p=(a+b+c)/2;
					double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
					max=Math.max(max, s);
				}		
		return max;	
	}
}
