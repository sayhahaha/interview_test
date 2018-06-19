package test;

import java.util.ArrayList;

public class GetUglyNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();    //获取开始时间
		System.out.println(GetUglyNumber_Solution3(150000));
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
	public static int GetUglyNumber_Solution3(int n)
    {
		 if(n<=0)
			 return 0;
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 list.add(1);
		 int i2=0,i3=0,i5=0;
		 while(list.size()<n)//循环的条件
		 {
		      int m2=list.get(i2)*2;
		      int m3=list.get(i3)*3;
		      int m5=list.get(i5)*5;
		      int min=Math.min(m2,Math.min(m3,m5));
		      list.add(min);
		      if(min==m2)i2++;
		      if(min==m3)i3++;
		      if(min==m5)i5++;
		 }
		      return list.get(list.size()-1);
    }
//	public static int GetUglyNumber_Solution(int index) {
//		if(index<=0)
//			return 0;
//		int nextUglyIndex=1;
//		int []uglyNumber=new int[index];
//		uglyNumber[0]=1;
//		int pMultiply2=uglyNumber[0];
//		int pMultiply3=uglyNumber[0];
//		int pMultiply5=uglyNumber[0];
//		int index2=nextUglyIndex;
//		int index3=nextUglyIndex;
//		int index5=nextUglyIndex;
//		while(nextUglyIndex<index)
//		{
//			int min=Min(pMultiply2*2,pMultiply3*3,pMultiply5*5);
//			uglyNumber[nextUglyIndex]=min;
//			while(pMultiply2*2<=uglyNumber[nextUglyIndex])
//				pMultiply2=uglyNumber[index2++];
//			while(pMultiply3*3<=uglyNumber[nextUglyIndex])
//				pMultiply3=uglyNumber[index3++];
//			while(pMultiply5*5<=uglyNumber[nextUglyIndex])
//				pMultiply5=uglyNumber[index5++];
//			nextUglyIndex++;
//		}
//		
//		return uglyNumber[nextUglyIndex-1];		
//	}
//	private static int Min(int i, int j, int k) {
//		// TODO Auto-generated method stub
//		int min=(i<j)?i:j;
//		min=(min<k)?min:k; 
//		return min;
//	}
}
