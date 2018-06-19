package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 10:03:53 PM  
*/
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,8,4,7,1,3,6,9,2};
		selectSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void selectSort(int arr[]){
		int len=arr.length;
		int min,index;
		for(int i=0;i<len;i++){
			min=arr[i];
			index=i;
			for(int j=i;j<len;j++){
				if(min>arr[j]){
					min=arr[j];
					index=j;
				}
			}
			if(i!=index)
				swap(arr,i,index);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
