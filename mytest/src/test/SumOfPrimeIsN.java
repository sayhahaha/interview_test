package test;

import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Aug 29, 2017 3:10:17 PM  
*/
public class SumOfPrimeIsN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int res=0;
//		if(isPrime(n-2))
//			res++;
		for(int i=2;i<=n/2;i++)
		{
			if(isPrime(i) && isPrime(n-i))
				res++;
		}
		System.out.println(res);
	}

	public static boolean isPrime(int n)
	{
		if(n<=3)
			return n>1;		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
