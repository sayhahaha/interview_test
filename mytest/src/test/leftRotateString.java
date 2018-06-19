package test;

public class leftRotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcXYZdef";
		String b=LeftRotateString(s,3);
		for(int i=0;i<b.length();i++)
			System.out.print(b.charAt(i));
	}
	public static String LeftRotateString(String str,int n) {
		if(n>str.length()||n<0||str.length()==0)
			return "";
		char [] temp=str.toCharArray();
		reverse(temp,0,n-1);
		reverse(temp,n,str.length()-1);
		reverse(temp,0,str.length()-1);
		String s=new String(temp);
		return s;
	
	}
//	public static String LeftRotateString(String str,int n) {
//		if(n>str.length()||n<0)
//			return "";
//		char a[]=new char[str.length()];
//		int j=0;
//		for(int i=n;i<str.length();i++)
//			a[j++]=str.charAt(i);
//		int i=0;
//		while(n-->0)
//		{
//			a[j++]=str.charAt(i++);
//		}
//		String s=new String(a);
//		return s;   
//    }
	private static void reverse(char[]  str, int start, int end) {
		// 灵活利用字符串翻转
		char  temp;
		while(start<end)
		{
			temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
	}
}
