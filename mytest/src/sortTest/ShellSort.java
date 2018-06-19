package sortTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 2, 2017 10:51:20 AM  
*/
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,5,8,4,7,1,3,6,9,2};
		shellSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void shellSort(int[] arr) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int step=len/2;
		while(step>=1){
			for(int i=0;i<step;i++){
				for(int j=i+step;j<len;j=j+step){
					int temp=arr[j];
					int k;
					for(k=j-step;k>=0;k=k-step){
						if(temp<arr[k])
							arr[k+step]=arr[k];
						else
							break;
					}
					arr[k+step]=temp;
				}
			}
			step/=2;
		}
	}

}
