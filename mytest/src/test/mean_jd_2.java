package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date ����ʱ�䣺Aug 2, 2017 4:58:25 PM 
* @version 1.0   
*/

/*
 * һ����A�����2��A-1���Ʊ��ʱ������λ��֮�͵ľ�ֵ�Ƕ��٣���ϣ�����ܰ������������⣿ ���еļ��������ʮ���ƽ��У����Ҳ��ʮ���Ʊ�ʾΪ����Լ��ķ�����ʽ�� 
��������:
�������ж���������ݣ�ÿ���������Ϊһ������A(1 �� A �� 5000).

�������:
��ÿ��������ݣ��ڵ�����������X/Y����ʽ��������

��������1:
5
3

�������1:
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
