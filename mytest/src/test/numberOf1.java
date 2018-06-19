package test;

public class numberOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=-8;
		System.out.println(NumberOf1(n));
	}
	public static int NumberOf1(int n) {
		int count=0;
		while(n!=0)
		{
			count++;
			n=n&n-1;
		}
		return count;
		}
}
