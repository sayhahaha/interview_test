package test;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(addnooperator(-124, 4567)); 
		
	}
	 public static int addnooperator(int a, int b) {  
	        if(b == 0) return a;  
	        int c = a ^ b;  
	        int d = (a & b) << 1;  
	        return addnooperator(c, d);  
	    }  
}
