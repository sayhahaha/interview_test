package test;
/*
 * ����һ������������Ϊ�������֣����Ҹ�����Ϊ1λ�����Ҹ�λ���ֳ˻���������YES�����������������NO��
 * 1221  YES
 * 1234  NO
 */
import java.util.ArrayList;
import java.util.Scanner;

public class newcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		if(balanceNumber(n))
			System.out.print("YES");
		else 
			System.out.print("NO");
		System.out.println("��������ʱ�䣺" + (System.currentTimeMillis() - startTime) + "ms");    //�����������ʱ��
	}

	public static boolean balanceNumber(int n)
	{
		ArrayList <Integer> list=new ArrayList<Integer>();
		int i=0;
		while(n!=0)
		{
			list.add(n%10);
			n=n/10;		
		}
		int s=1;
		int temp=0;
		for(i=0;i<list.size();i++)
		{					
			s=s*list.get(i);
			temp=s;
			int j=i+1;
			while(j<list.size())
			{
				if(list.get(j)==0)
					return false;
				temp=temp/list.get(j++);
			}
			if(temp==1)
				return true;
		}
		return false;
	}
}
