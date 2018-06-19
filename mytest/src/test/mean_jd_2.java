package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 2, 2017 4:58:25 PM 
* @version 1.0   
*/

/*
 * 一个数A如果按2到A-1进制表达时，各个位数之和的均值是多少？她希望你能帮她解决这个问题？ 所有的计算均基于十进制进行，结果也用十进制表示为不可约简的分数形式。 
输入描述:
输入中有多组测试数据，每组测试数据为一个整数A(1 ≤ A ≤ 5000).

输出描述:
对每组测试数据，在单独的行中以X/Y的形式输出结果。

输入例子1:
5
3

输出例子1:
7/3
2/1
 */
public class mean_jd_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			int gmd=getMaxDivide_ab(sumOfjinzhi(n),(n-2));
			if(gmd!=0)
				System.out.println(sumOfjinzhi(n)/gmd+"/"+(n-2)/gmd);
			else
				System.out.println(sumOfjinzhi(n)+"/"+(n-2));
			}
	}

	public static int sumOfjinzhi(int n){
		int sum=0;
		if(n==1||n==2)
			return 1;
		for(int i=2;i<=n-1;i++)
		{
			int k=n;
			while(k!=0)
			{
				sum+=k%i;
				k=k/i;
			}
		}		
		return sum;		
	}
	public static int getMaxDivide_ab(int a,int b){
        if(a<b){
                int temp;
                temp=a;
                a=b;
                b=temp;
        }
        if(b==0){
        	return 0;
        }
        while (a % b != 0) {   
            int temp = a % b;   
            a = b;   
            b = temp;   
        }   
        return b;
}
}
