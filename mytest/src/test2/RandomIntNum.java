package test2;

import java.util.Random;

/** 
* @author xxh 	
* @date ����ʱ�䣺Nov 2, 2017 11:21:37 AM  
*/
public class RandomIntNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=randomArray(10,20,6);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static int[] randomArray(int min,int max,int n){  
	    int len = max-min+1;  	      
	    if(max < min || n > len){  
	        return null;  
	    }  
	      
	    //��ʼ��������Χ�Ĵ�ѡ����  
	    int[] source = new int[len];  
	    for (int i = min; i < min+len; i++){  
	        source[i-min] = i;  
	    }  
	         
        int[] result = new int[n];  
        Random rd = new Random();  
        int index = 0;  
        for (int i = 0; i < result.length; i++) {  
        	//��ѡ����0��(len-2)���һ���±�  
           index = Math.abs(rd.nextInt() % len--);  
           //�������������������  
           result[i] = source[index];  
           //����ѡ�����б�������������ô�ѡ����(len-1)�±��Ӧ�����滻  
           source[index] = source[len];  
       }  
	   return result;  
	}  
}
