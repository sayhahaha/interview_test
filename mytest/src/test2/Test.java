package test2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/** 
* @author xxh 	
* @date 创建时间：Sep 20, 2017 5:48:28 PM  
*/
public class Test {
	private static int i;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		StringBuffer buffer =new StringBuffer();
		int value=18;
		do{
			int temp=value&0x07;
			buffer.append(temp);
		}while((value>>>=3)!=0);
		
		System.out.println(buffer.reverse());
		foo(i);
		System.out.print(i);
		System.out.print("abc".equals("abc"));
	
		
//		char chr[]="abc";
		char chr2[]={'a','b','c'};
		System.out.println(chr2.length);

		try{
			System.out.println("try");
			throw new NullPointerException("nullPointerException");
		}catch(ArithmeticException e){
			System.out.println("catched");
		}catch(NullPointerException e){
			System.out.println("catched");
		}
	
		int a[]={1,3,5,7,9};
		int b[]={2,2,2,2};
		int c[]=mergearray(a,5,b,4);
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]);
	}

	public static void foo(int i) {
		// TODO Auto-generated method stub
		i++;
	}

	public static int[] mergearray(int a[],int alen,int b[],int blen){
		int len=alen+blen-1;
		alen--;
		blen--;
	
		int[] c= new int[len+1];
		while(alen>0 || blen>0){
			if(a[alen]>b[blen])
				c[len--]=a[alen--];
			else
				c[len--]=b[blen--];
		}
		while(blen>=0)
			c[len--]=b[blen--];
		return c;
	}
	
}
