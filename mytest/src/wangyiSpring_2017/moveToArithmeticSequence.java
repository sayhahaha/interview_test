package wangyiSpring_2017;

import java.util.Arrays;
import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 13, 2017 3:31:26 PM 
* @version 1.0   
*/
public class moveToArithmeticSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int seq[]= new int[n];
		for(int i=0;i<n;i++)
		{
			seq[i]=sc.nextInt();
		}
		
		if(isArithmeticSequence2(seq,n))
			System.out.println("Possible");
		else
			System.out.println("Impossible");

	}

	//方法1 利用等差数列求和公式计算
	public static boolean isArithmeticSequence(int[] seq, int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=seq[i];
			min=Math.min(min, seq[i]);
		}
		if( (2*(sum-n*min)) % (n*(n-1))==0)
			return true;
		else
			return false;
	}
	//方法2 先排序，在遍历数组，看是否等差
	public static boolean isArithmeticSequence2(int[] seq, int n) {
		Arrays.sort(seq);
		int d=seq[1]-seq[0];
		for(int i=2;i<n;i++)
		{
			if(d!=seq[i]-seq[i-1])
				return false;
		}
		return true;
	}

}
