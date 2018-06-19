package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date ����ʱ�䣺Jul 29, 2017 4:05:17 PM 
* @version 1.0   
*/
public class SubstringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String text=in.nextLine();
			String pattern=in.nextLine();			
			System.out.println(KMP(text,pattern));
			}
	}
	/*
	 * ����������ʱ�临�Ӷ� n*m
	 */
	public static boolean hasSubstring(String text,String pattern){
		char pShortString[]=pattern.toCharArray();
		char pLongString[]=text.toCharArray();
		int n=pLongString.length;
		int m=pShortString.length;
		for(int i=0;i<=n-m;i++)
		{
			int j=0;
			while(j<m && pShortString[j]==pLongString[i+j]){
				j++;
			}
			if(j==m)
				return true;
		}		
		return false;
	}

	/*
	 * KMP�㷨��ʱ�临�Ӷ�n+m
	 * �ռ临�Ӷ�m
	 */
	public static boolean KMP(String text,String pattern){
		char pShortString[]=pattern.toCharArray();
		char pLongString[]=text.toCharArray();
		int n=pLongString.length;
		int m=pShortString.length;
		int lps[]= computeTemporaryArray(pattern);
		int i=0;
		int j=0;
		while(i<n&&j<m){
			if(pLongString[i]==pShortString[j])
			{
				i++;
				j++;
			}
			else{
				if(j!=0){
					j=lps[j-1];
				}
				else{
					i++;
				}
			}			
		}
		if(j==m)
			return true;
		return false;
		
	}
	/*
	 * ����ǰ׺���ʽ����
	 */
	public static int[] computeTemporaryArray(String pattern) {
		// TODO Auto-generated method stub
		char[] str=pattern.toCharArray();
		int[] lps=new int[str.length];
		int left=0;
		int right=1;
		while(right<str.length){
			if(str[left]==str[right]){
				lps[right]=left+1;
				left++;
				right++;
			}
			else{
				if(left!=0){
					left=lps[left-1];
				}else{
					lps[right]=0;
					right++;
				}
			}
		}
		return lps;
	}
}
