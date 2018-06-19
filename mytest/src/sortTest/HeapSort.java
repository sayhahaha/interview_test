package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Sep 29, 2017 5:47:07 PM  
*/
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={2,5,8,4,7,1,3,6,9};
		for(int i=(arr.length-1-1)/2;i>=0;i--)
			heapAdjust(arr,i,arr.length-1);
		for(int i=arr.length-1;i>0;i--){
			swap(arr,0,i);
			heapAdjust(arr,0,i-1);
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void heapAdjust(int arr[],int s,int end){
		while(2*s+1<=end){
			int child=2*s+1;
			if(child<end && arr[child]<arr[child+1])
				child++;
			if(arr[s]<arr[child]){
				swap(arr,s,child);
				s=child;
			}else
				break;
		}
	}

	public static void swap(int[] arr, int s, int child) {
		// TODO Auto-generated method stub
		int temp=arr[s];
		arr[s]=arr[child];
		arr[child]=temp;
	}
}
