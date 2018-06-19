package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 10:14:53 PM  
*/
public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,8,4,7,1,3,6,9,2};
		insertSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void insertSort(int arr[]){
		int len=arr.length;
		int i,j;
		for(i=1;i<len;i++){
			int temp=arr[i];//待插入元素
			for(j=i-1;j>=0;j--){
				if(temp<arr[j]){
					arr[j+1]=arr[j];
				}else
					break;
			}
			arr[j+1]=temp;
		}
	}
}
