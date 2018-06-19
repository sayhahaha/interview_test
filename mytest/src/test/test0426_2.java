package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class test0426_2 {

    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    public static int resolve(String expr) {
//    	String str = expr.replaceAll(" +",""); 
    	String[] exprs = expr.split("\\s+");
    	Stack <Integer> stk=new Stack<Integer>();
    	for(int i=0;i<exprs.length;i++)
    	{
    		if(!exprs[i].equals("*")&&!exprs[i].equals("^")&&!exprs[i].equals("+"))	
    		{
    			stk.push(Integer.parseInt(exprs[i]));   		
    			if(stk.size()>16)
        			return -2;        		      			
    		} 		
    		if(exprs[i].equals("^"))
    		{
    			if(stk.isEmpty())
    				return -1;
    			int temp=stk.pop();
    			stk.push(temp+1);    			
    		}
    		if(exprs[i].equals("+")||exprs[i].equals("*"))
    		{
    			if(stk.size()<2)
    				return -1;
    			int temp1=stk.pop();
    			int temp2=stk.pop();
    			if(exprs[i].equals("+"))
    				stk.push(temp1+temp2);
    			if(exprs[i].equals("*"))
    				stk.push(temp1*temp2);	    			
    		}
    	}  
    	if(!stk.isEmpty())
    		return stk.pop(); 
    	else
    		return -1;
    }
}