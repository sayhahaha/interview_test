package test;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/** 
* @author xxh 	
* @date 创建时间：Aug 18, 2017 11:29:10 AM  
*/
public class MergeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int A[]=new int[n];
		int B[]=new int[m];
		for(int i=0;i<n;i++)
			A[i]=sc.nextInt();
		for(int i=0;i<m;i++)
			B[i]=sc.nextInt();
		int res[]=mergeSet(A,n,B,m);
		for(int i=0;i<res.length-1;i++)			
			System.out.print(res[i]+" ");
		System.out.println(res[res.length-1]);
	}

	public static int[] mergeSet(int A[],int n,int B[],int m)
	{
		Set <Integer> set = new TreeSet <Integer>();
		for(int i=0;i<n;i++)
			set.add(A[i]);
		for(int i=0;i<m;i++)
			set.add(B[i]);
		int res[]=new int[set.size()];
		Iterator <Integer> it = set.iterator();
		int i=0;
		while(it.hasNext())
		{
			res[i++]=it.next();
		}		
		return res;
	}
}
