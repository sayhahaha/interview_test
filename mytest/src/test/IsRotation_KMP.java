package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 8, 2017 8:50:06 PM 
* @version 1.0   
*/
public class IsRotation_KMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			System.out.println(isRotation(str1,str2));
		}
	}

	public static boolean isRotation(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length()!=str2.length()||str1==null||str2==null)
			return false;
		String str=str1+str1;		
		return isSubString(str,str2);
	}

	public static boolean isSubString(String text, String pattern) {
		// TODO Auto-generated method stub
		char Ptext[] = text.toCharArray();
		char Ppattern[] = pattern.toCharArray();
		int lps [] = computeTemporaryArray(Ppattern);
		int i=0;
		int j=0;
		while(i<Ptext.length && j<Ppattern.length)
		{
			if(Ptext[i]==Ppattern[j])
			{
				i++;
				j++;
			}
			else
			{
				if(j!=0)
				{
					j=lps[j-1];
				}
				else
				{
					i++;
				}
			}
		}
		if(j==Ppattern.length)
			return true;
		return false;
	}

	public static int[] computeTemporaryArray(char[] pattern) {
		// TODO Auto-generated method stub
		int len=pattern.length;
		int i=0;
		int j=1;
		int lps[]=new int [len];
		while(j<len)
		{
			if(pattern[i]==pattern[j])
			{
				lps[j]=i+1;
				i++;
				j++;
			}
			else
			{
				if(i!=0)
				{
					i=lps[i-1];
				}
				else
				{
					lps[j]=0;
					j++;
				}
			}
		}
		return lps;
	}

}
