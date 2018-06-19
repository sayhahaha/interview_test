package test;
/** 
* @author xiaohao 	
* @date 创建时间：2017年5月18日 下午8:25:24 
* @version 1.0   
*/
public class getNumberOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,2,2,2,4,5,5,6};
		System.out.println(GetNumberOfK(a,2));
	}

	public static int GetNumberOfK(int [] array , int k) {
		int length=array.length;
		int firstK=findFirstK(array,k,0,length-1);
		int lastK=findLastK(array,k,0,length-1);
		return lastK-firstK+1;
		
	}

	private static int findLastK(int[] array, int k, int start, int end) {
		// TODO Auto-generated method stub
		int mid =(start+end)/2;
		while(start<=end)
		{
			if(array[mid]<=k)
				start=mid+1;
			if(array[mid]>k)
				end=mid-1;			
			mid =(start+end)/2;
		}
		return end;
	}

	private static int findFirstK(int[] array, int k, int start, int end) {
		// TODO Auto-generated method stub
		int mid =(start+end)/2;
		while(start<=end)
		{
			if(array[mid]<k)
				start=mid+1;
			if(array[mid]>=k)
				end=mid-1;			
			mid =(start+end)/2;
		}
		return start;
	}
}
