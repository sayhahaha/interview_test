package test;

import java.util.Date;

/** 
* @author xxh 	
* @date 创建时间：Sep 11, 2017 10:10:16 AM  
*/
public class Test3 {
	public static class Square {  
	    long width;  
	    public Square(long l) {   
	        width = l;  
	    }  
	    public static void main(String arg[]) throws ClassNotFoundException {   
	        Integer a=1;  
	        Integer b=2;  
	        Integer c=3;  
	        Integer d=3;  
	        Long g=3L;  
	        Integer e=321;  
	        Integer f=321;  
	        System.out.println(c==d);
	        System.out.println(c==(a+b));
	        System.out.println(c.equals(a+b));
	        System.out.println(g==(a+b));
	        System.out.println(g.equals(a+b));
	        System.out.println(e==f);
//	        String ss="hello";
//	        String tt="hello";
//	        char cc[] ={'h','e','l','l','o'};
//	        System.out.println(ss.equals(tt));
//	        System.out.println(ss.equals(cc));
//	        System.out.println(cc.equals(tt));
//	        System.out.println(ss==tt);
//	        System.out.println(ss.equals(new String("hello")));
//	        System.out.println(ss==new String("hello"));


	        String str=new String("123");
	        System.out.println(str.getClass());
	        System.out.println(Date.class);
	        System.out.println(Class.forName("java.util.Arrays"));
	        

	    } 
	}
}
