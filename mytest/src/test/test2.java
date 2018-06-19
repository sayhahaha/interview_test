package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        //树的高度
        int k=in.nextInt();
        //最开始根节点的值
        int root=(int)Math.pow(2,k-1);
        //最开始的最左叶子节点和最右叶子节点
        int leftNode=1;
        int rightNode=(int)Math.pow(2,k)-1;
        //输入3个叶子节点的值
        int node1=in.nextInt();
        int node2=in.nextInt();
        int node3=in.nextInt();
        for(int i=1;i<=k;i++){
            //3个叶子节点全在根节点的左部,更新最右节点和根节点
            if(node1<root&&node2<root&&node3<root){
                rightNode=root-1;
                root=(leftNode+rightNode)/2;
            }
            //3个叶子节点全在根节点的右部,更新最左节点和根节点
            else if(node1>root&&node2>root&&node3>root){
                leftNode=root+1;
                root=(leftNode+rightNode)/2;
            }
            //一大一小的情形下根节点即为最大公共父节点
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
