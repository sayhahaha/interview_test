package test;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sum_Solution(100));
	}
	 public static int Sum_Solution(int n) {
		int sum=n;
		boolean b=n>0&&(sum+=Sum_Solution(n-1))>0;
		return sum;	        
	    }
}
