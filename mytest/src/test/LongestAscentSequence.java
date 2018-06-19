package test;

import java.util.Scanner;

/** 
* @author xiaohao 	
* @date ����ʱ�䣺Aug 15, 2017 5:05:00 PM 
* @version 1.0   
*/
public class LongestAscentSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(findLongest(arr,n));
		
		int res[]=findLongest2(arr,n);
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
				System.out.print(res[i]+" ");
		}
	}

	public static int findLongest(int[] arr, int n) {
		// TODO Auto-generated method stub
		int end[]=new int[n+1];
		int len=1;
		end[1]=arr[0];
		int pos=0;
		for(int i=1;i<n;i++)
		{
			pos=findInsertPos(end,1,len,arr[i]);//�ҵ�����λ��
			end[pos]=arr[i];//����Ҫ����LIS����
			if(len<pos)
				len=pos;
		}		
		return len;
	}     

	//�ڵ������� arr[start...end]�������䣩�϶��ֲ��ҵ�һ�����ڵ���key��λ�ã������С��key���ͷ���end+1
	public static int findInsertPos(int[] arr, int start, int end, int key) {
		// TODO Auto-generated method stub
		if(arr[end]<key)	
			return end+1;		
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]<key)
				start=mid+1;
			else
				end=mid;
		}
		return start;
	}

	
	public static int[] findLongest2(int[] arr, int n) {
		// TODO Auto-generated method stub
		int end[]=new int[n+1];
		int len=1;
		end[1]=arr[0];
		int pos=0;
		for(int i=1;i<n;i++)
		{
			pos=findInsertPos(end,1,len,arr[i]);//�ҵ�����λ��
			end[pos]=arr[i];//����Ҫ����LIS����
			if(len<pos)
				len=pos;
		}		
		return end;
	}
}
