package collection_test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Vector;

/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 10:40:53 PM  
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer []arr=new Integer[2];
		int count=0;
		for(Integer i:arr)
			i=count++;
		for(Integer j:arr)
			System.out.println(j);
	
		if (System.out.printf("Hello ") == null) 
			System.out.print("Hello ");
		else
			System.out.print("World！");

		int x=4;
		int n=0;
		while(x>0){
			n++;
			x&=x-1;
		}
		System.out.print(n);
		
//		Map<Key, String> map=new HashMap<Key, String>();
//
//    	map.put(new Key(1), "result1");
//    	map.put(new Key(2), "result2");
//    	map.put(new Key(3), "result3");
//    	map.put(new Key(4), "result4");
//    	map.put(new Key(5), "result5");
//    	map.put(new Key(6), "result6");
//    	map.remove(new Key(6), "result6");
//    	map.clear();
//    	Key k = new Key(1);
//    	map.put(k, "result5");
//    	System.out.println(map.size());
//    	System.out.println(map.get(k).equals("result5"));
//
//    	System.out.println(new Key(1,2).fun());
//    	
//    	
//    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//    	pq.offer(10);
//    	pq.offer(6);
//    	pq.offer(1);
//    	pq.offer(7);
//    	pq.offer(5);
//		int count=0;
//		for(int i=0;i<1500;i++)
//			if(i%2==0&&i%5==0&&i%7==0)
//				count++;
////		System.out.println(JumpFloor(10));
//		
//		int x=1^(1<<31>>31);
//		int arr[]={1,3,3,5,6,6,7};
//		System.out.println(fun(arr,97));

		
	}
	  public static int JumpFloor(int target) {
			if(target<=2)
				return target;
			int first=1,second=2,third=0;
			for(int i=3;i<=target;i++)
			{
				third=first+second;
				first=second;
				second=third;
			}			
			return third;
		    
	    }
	  public static int fun(int data[],int target){
			int left=0;
			int right=data.length-1;
			while(left<=right){
				int mid=(left+right)/2;
				if(data[mid]<=target)
					left=mid+1;
				else
					right=mid-1;
			}
			if(data[right]==target)
				return right;
			return -1;
	  }
}
