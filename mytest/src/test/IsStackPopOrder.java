package test;

import java.util.Scanner;
import java.util.Stack;

/** 
* @author xxh 	
* @date 创建时间：Sep 5, 2017 10:06:40 AM  
*/
public class IsStackPopOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int pushA[]=new int [n];
		int popA[]=new int [n];
		for(int i=0;i<n;i++)
			pushA[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			popA[i]=sc.nextInt();
		System.out.println(IsPopOrder(pushA,popA));
	}
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		int n=pushA.length;
		int index=0;
		int j=0;
		Stack <Integer> stk = new Stack<Integer>();
		while(index<n)
		{
			stk.push(pushA[index++]);
			while(!stk.isEmpty() && stk.peek()==popA[j]){
				stk.pop();
				j++;
			}
		}		
//		while(!stk.isEmpty()){
//			if(stk.peek()==popA[j])
//			{
//				stk.pop();
//				j++;	
//			}
//			if(stk.peek()!=popA[j])
//				return false;		
//		}
		return stk.isEmpty();
	}
}
