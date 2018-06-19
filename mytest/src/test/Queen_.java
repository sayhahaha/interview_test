package test;

import java.util.Scanner;
public class Queen_ {

	/*
	 * 棋盘问题在一个给定形状的棋盘（形状可能是不规则的）上面摆放棋子，棋子没有区别。
	 * 要求摆放时任意的两个棋子不能放在棋盘中的同一行或者同一列，
	 * 请编程求解对于给定形状和大小的棋盘，摆放k个棋子的所有可行的摆放方案C。
	 * 
	 */
	private static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [][]a = new int[n][n];
		int vis[]=new int[n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			 	a[i][j]=in.nextInt();
		dfs(0,n,a,vis);
		System.out.print(count);
	}
	
	public static void dfs(int row,int n,int a[][],int vis[])
	{
		if(row==n)
		{
			count++;
			return;
		}
		for(int j=0;j<n;j++)
			if(a[row][j]==1 && vis[j]==0)
			{
				vis[j]=1;
				dfs(row+1,n,a,vis);
				vis[j]=0;
			}
	}
}
