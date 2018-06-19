package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 2, 2017 5:29:08 PM 
* @version 1.0   
*/
public class luckyNum_jd_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int result=0;
		for(int i=1;i<=n;i++)
		{
			if(IsLuckyNum(i))
				result++;
		}
		System.out.println(result);

	}

	public static boolean IsLuckyNum(int n) {
		// TODO Auto-generated method stub
		int f=sumOfjinzhi(n,10);
		int g=sumOfjinzhi(n,2);
		if(f==g)
			return true;
		else
			return false;
	}

	public static int sumOfjinzhi(int n, int i) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n!=0)
		{
			sum+=n%i;
			n=n/i;
		}
		return sum;
	}
}
