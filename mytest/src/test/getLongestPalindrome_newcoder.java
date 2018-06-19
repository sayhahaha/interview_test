package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 8, 2017 10:52:31 AM 
* @version 1.0   
*/
public class getLongestPalindrome_newcoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String A= sc.nextLine();
			
//			System.out.println(getLongestPalindrome2(A,A.length()));
			
			System.out.println(longestPalindrome(A));
		}
	}
	public static int getLongestPalindrome(String A, int n) {
		char[] ch=A.toCharArray();
		char s_new[]=initChr(ch);
		int len=s_new.length;
		int id=0;
		int mx=0;
		int max_len=0;
		int p[]=new int[len];
		for(int i=0;i<len;i++)
		{
			if(i<mx)
			{
				p[i]=Math.min(p[2*id-i],mx-i);
			}else
				p[i]=1;
			//情况三：扩展回文半径,注意加边界判断
			while(i-p[i]>=0 && i+p[i]<len && s_new[i-p[i]]==s_new[i+p[i]])
			{
				p[i]++;
			}
			//更新id、mx
			if(i+p[i]>mx)
			{
				id=i;
				mx=i+p[i];
			}
			max_len= Math.max(max_len,p[i]);
		}
		return max_len-1; 
    }
	public static char[] initChr(char[] ch) {
		// TODO Auto-generated method stub
		char s_new[]=new char[2*ch.length+1];
//		s_new[0]='$';
		s_new[0]='#';
		int j=1;
		for(int i=0;i<ch.length;i++)
		{
			s_new[j++]=ch[i];
			s_new[j++]='#';			
		}		
		return s_new;
	}

	
	public static String getLongestPalindrome2(String A, int n) {
		char[] ch=A.toCharArray();
		char s_new[]=initChr(ch);
		int len=s_new.length;
		int id=0;
		int mx=0;
		int max_len=0;
		int max_index=0;
		int p[]=new int[len];
		for(int i=0;i<len;i++)
		{
			if(i<mx)
			{
				p[i]=Math.min(p[2*id-i],mx-i);
			}else
				p[i]=1;
			//情况三：扩展回文半径,注意加边界判断
			while(i-p[i]>=0 && i+p[i]<len && s_new[i-p[i]]==s_new[i+p[i]])
			{
				p[i]++;
			}
			//更新id、mx
			if(i+p[i]>mx)
			{
				id=i;
				mx=i+p[i];
			}
			if(max_len<p[i])
			{
				max_len=p[i];
				max_index=id;
			}
			
		}
		max_len= max_len-1;
		char maxSubChr[] = new char[(2*max_len+1)/2];
		for(int i=max_index-max_len,j=0;i<=max_index+max_len;i++)
			if(s_new[i]!='#')
			{
				maxSubChr[j]=s_new[i];
				j++;
			}
		return new String(maxSubChr); 
    }
	
	
	public static int longestPalindrome(String s) {
	     int n=s.length();
	     boolean[][] pal=new boolean[n][n];
	     //pal[i][j] 表示s[i...j]是否是回文串
	     int maxLen=0;
	     for (int i=0;i<n;i++){  // i作为终点
	         int j=i;    //j作为起点
	         while (j>=0){
	        	 //判断首尾相等并不足以证明是回文串，如：abcda，所以需要&& 后边的部分
	             if (s.charAt(j)==s.charAt(i)&&(i-j<2||pal[j+1][i-1]))
	             {
	                 pal[j][i]=true;
	                 maxLen=Math.max(maxLen, i-j+1);
	             }
	             j--;
	         }
	     }
	     return maxLen;
	    }
}
