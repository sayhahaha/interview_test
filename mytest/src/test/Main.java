package test;

import java.util.Scanner;

public class Main {
	static int a[]={1,2,3,4,5,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);  
		 String str=scan.next();
         int []b=reverse(str);
         for(int i=0;i<6;i++){        	
        	 System.out.print(b[i]);      
         }	
	}

	public static int[] reverse(String str){
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='R'){
				swap(a,4,5);
				swap(a,0,4);
				swap(a,1,5);
			}
			if(c[i]=='L'){
				swap(a,0,1);
				swap(a,0,4);
				swap(a,1,5);
			}
			if(c[i]=='F'){
				swap(a,2,3);
				swap(a,2,4);
				swap(a,3,5);
			}
			if(c[i]=='B'){
				swap(a,4,5);
				swap(a,2,4);
				swap(a,3,5);
			}
			if(c[i]=='A'){
				swap(a,2,3);
				swap(a,0,2);
				swap(a,1,3);
			}
			if(c[i]=='C'){
				swap(a,0,1);
				swap(a,0,2);
				swap(a,1,3);
			}
		}
		return a;
	}
	public  static  void  swap ( int [] data,  int  a,  int  b) {  
        int  t = data [a];      
        data [a] = data [b];      
        data [b] = t;      
	} 
}
