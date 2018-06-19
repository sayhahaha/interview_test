package test;

import java.util.ArrayList;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Aug 24, 2017 9:20:40 PM  
*/
public class FindContinuousSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> res=findContinuousSequence(n);
		System.out.println(res);
	}
	public static ArrayList<ArrayList<Integer> > findContinuousSequence(int sum) {		
		ArrayList<ArrayList<Integer>> lists =new ArrayList<ArrayList<Integer>>();
		int left=1;
		int right=1;
		int subSum=0;
		while(left<(sum+1)/2)
		{
			subSum=(left+right)*(right-left+1)/2;
			if(subSum==sum)
			{
				ArrayList <Integer> list = new ArrayList<Integer> ();
				for(int i=left;i<=right;i++)
					list.add(i);
				left++;
				right++;
				lists.add(list);
			}else if(subSum<sum)
			{
				right++;
			}else{
				left++;
			}
		}
		return lists;       
    }
}
