package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 2, 2017 9:53:44 AM  
*/
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,5,8,4,7,1,3,6,9,2};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void quickSort(int[] arr,int low,int high) {
		// TODO Auto-generated method stub
		if(low<high){	 //如果不加这个判断递归会无法退出导致堆栈溢出异常
			int mid=partion(arr,low,high);
			quickSort(arr,low,mid-1);
			quickSort(arr,mid+1,high);
		}
		
	}

	public static int partion(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int temp=arr[low];
		while(low<high){
			while(low<high && arr[high]>=temp)
				high--;
			arr[low]=arr[high];
			while(low<high && arr[low]<temp)
				low++;
			arr[high]=arr[low];
		}
		arr[low]=temp;
		return low;
	}

}
