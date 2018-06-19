package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 2, 2017 10:21:42 AM  
*/
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,5,8,4,7,1,3,6,9,2};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void mergeSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int sec=mid+1;
		int res[]=new int[high-low+1];
		int i=0;
		int temp=low;
		while(low<=mid && sec<=high){
			if(arr[low]<arr[sec]){
				res[i++]=arr[low++];
			}else{
				res[i++]=arr[sec++];
			}				
		}
		while(low<=mid){
			res[i++]=arr[low++];
		}
		while(sec<=high){
			res[i++]=arr[sec++];
		}
		i=0;
		while(temp<=high)
			arr[temp++]=res[i++];
	}

}
