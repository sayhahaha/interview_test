package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        //���ĸ߶�
        int k=in.nextInt();
        //�ʼ���ڵ��ֵ
        int root=(int)Math.pow(2,k-1);
        //�ʼ������Ҷ�ӽڵ������Ҷ�ӽڵ�
        int leftNode=1;
        int rightNode=(int)Math.pow(2,k)-1;
        //����3��Ҷ�ӽڵ��ֵ
        int node1=in.nextInt();
        int node2=in.nextInt();
        int node3=in.nextInt();
        for(int i=1;i<=k;i++){
            //3��Ҷ�ӽڵ�ȫ�ڸ��ڵ����,�������ҽڵ�͸��ڵ�
            if(node1<root&&node2<root&&node3<root){
                rightNode=root-1;
                root=(leftNode+rightNode)/2;
            }
            //3��Ҷ�ӽڵ�ȫ�ڸ��ڵ���Ҳ�,��������ڵ�͸��ڵ�
            else if(node1>root&&node2>root&&node3>root){
                leftNode=root+1;
                root=(leftNode+rightNode)/2;
            }
            //һ��һС�������¸��ڵ㼴Ϊ��󹫹����ڵ�
            else{
                System.out.println(root);
                break;
            }
        }
		    
	}
	
	 public static String removerepeatedchar(String s) {
	        if (s == null)
	            return s;
	       Set <Character> set = new HashSet<Character>();
	       for(int i=0;i<s.length();i++)
	       {
	    	   set.add(s.charAt(i));
	       }
	       Iterator <Character>  it = set.iterator();
	       char []chr = new char[set.size()];
	       int i=0;
	       while(it.hasNext())
	       {
	    	   chr[i++]=it.next();
	       }
	       return String.valueOf(chr);
	    }
	
	
	public  static  void  swap ( int [] data,  int  a,  int  b) {  
        int  t = data [a];      
        data [a] = data [b];      
        data [b] = t;      
}  
	public  static  void  swap2 ( int  a,  int  b) {  
        int  t = a;      
        a = b;      
        b = t;      
}
}
