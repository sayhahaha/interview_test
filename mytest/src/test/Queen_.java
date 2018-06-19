package test;

import java.util.Scanner;
public class Queen_ {

	/*
	 * ����������һ��������״�����̣���״�����ǲ�����ģ�����ڷ����ӣ�����û������
	 * Ҫ��ڷ�ʱ������������Ӳ��ܷ��������е�ͬһ�л���ͬһ�У�
	 * ���������ڸ�����״�ʹ�С�����̣��ڷ�k�����ӵ����п��еİڷŷ���C��
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
