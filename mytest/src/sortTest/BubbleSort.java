package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 6:01:40 PM  
*/
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,8,4,7,1,3,6,9};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void bubbleSort(int arr[]){
		int len=arr.length;
		boolean flag=true;
		for(int i=0;i<len && flag;i++){
			flag=false;
			for(int j=len-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					flag=true;
				}
			}
		}
	}
}
