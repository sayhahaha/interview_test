package wangyiSpring_2017;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 13, 2017 4:04:05 PM 
* @version 1.0   
*/
public class staggered01Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(NumOf01Sequence(str.toCharArray()));
	}

	public static int NumOf01Sequence(char str[])
	{
		if(str.length==1)
			return 1;
		int max=1;
		int count=1;
		for(int i=1;i<str.length;i++)
		{
			if(str[i]!=str[i-1])
			{
				count++;
				max=Math.max(max, count);
			}
			else
				count=1;
		}
		return max;	
	}
}
