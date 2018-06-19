package test;

public class GetUglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
		System.out.print(GetUglyNumber_Solution(1500));
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
	public static int GetUglyNumber_Solution(int index) {
		int uglyIndex=0;
		int number=0;
		while(uglyIndex<index)
		{
			number++;
			if(isUgly(number))
			{
				uglyIndex++;
			}
		}
	    return number;
	}
	public static boolean isUgly(int number){
		if(number<1)
			return false;
		while(number%2==0)
			number/=2;
		while(number%3==0)
			number/=3;
		while(number%5==0)
			number/=5;
		if(number==1)
			return true;
		else
			return false;
	}
}
