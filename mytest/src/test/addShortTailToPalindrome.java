package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 8, 2017 3:07:48 PM 
* @version 1.0   
*/
public class addShortTailToPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(addToPalindrome(str,str.length()));
	}

	 public static String addToPalindrome(String A, int n) {
		char []ch = A.toCharArray();
		char s_new []=initChr(ch);
		int id=0;
		int mx=0;
		int p[]=new int[s_new.length];
		int i=0;
		for( i=0;i<s_new.length;i++)
		{
			if(i<mx)
			{
				p[i]=Math.min(p[2*id-i], mx-i);
			}else
				p[i]=1;
			while(i+p[i]<s_new.length && i-p[i] >=0 && s_new[i-p[i]]==s_new[i+p[i]])
			{
				p[i]++;
			}
			if(i+p[i]>mx)
			{
				id=i;
				mx=i+p[i];
			}
			//最右回文半径到达字符串最右边界的位置时,跳出循环，找到此时的中心id和此中心的回文半径(p[i]-1)
			if(mx==s_new.length)
			{
				break;
			}
		}
		char final_ch []=new char[(id-(p[i]-1))/2];
		for(int j=id-p[i],k=0;j>=0;j--)
		{
			if(s_new[j]!='#')
			{
				final_ch[k++]=s_new[j];				
			}
		}
		return String.valueOf(final_ch);	        
	 }
	 public static char [] initChr(char ch[])
	 {
		char[] s_new = new char [2*ch.length+1];
		s_new[0]='#';
		int j=1;
		for(int i=0;i<ch.length;i++)
		{
			s_new[j++]=ch[i];
			s_new[j++]='#';
		}
		return s_new;	 
	 }
}
