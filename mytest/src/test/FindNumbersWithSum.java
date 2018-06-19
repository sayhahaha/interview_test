package test;

import java.util.ArrayList;
import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Sep 5, 2017 11:28:23 AM  
*/
public class FindNumbersWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int array[]=new int [n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		int sum=sc.nextInt();
		System.out.println(findNumbersWithSum(array,sum));
	}

	public static ArrayList<Integer> findNumbersWithSum(int [] array,int sum) {        
        ArrayList <Integer> list =new ArrayList<Integer>();
        int len=array.length;
        if (len==0)
            return list;
        int left=0;
        int right=len-1;
        while(left < right)
        {
            if(array[left]+array[right]<sum){
                left++;
            }else if(array[left]+array[right]>sum){
                right--;
            }else{
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
        }
        return list;
    }
}
