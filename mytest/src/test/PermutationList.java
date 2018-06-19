package test;

public class PermutationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1="20131";
		int n=c1.compareTo("20131030");
		System.out.print(n);
		
		char a[]=PermutationList(21);
		for(int i=0;i<22;i++)
			System.out.print(a[i]);
		}

	public static  char[] PermutationList(int n){
		char []a = new char[1000];
		for(int i=0;i<n;i++)
			a[i]= (char) (i-'0');
//		for(int i=0;i<n;i++)
//			for(int j=i;j<n;j++)
//			{
////				if(a[j].)
//			}
		return a;
	}
}
