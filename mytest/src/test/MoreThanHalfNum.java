package test;
/** 
* @author xiaohao 	
* @date 创建时间：2017年4月30日 下午2:31:29 
* @version 1.0   
*/
public class MoreThanHalfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 3, 4, 2, 6, 2 };
		System.out.println(MoreThanHalfNum_Solution2(a));
	}

	public static int MoreThanHalfNum_Solution(int [] array) {
		int	 result=array[0];
		int times=1; 
		for(int i=1;i<array.length;i++)
		{ 
			if(times==0)
			{
				result=array[i];
				times=1;
			}
			else
			{
				if(array[i]==result)					
					times++;					
				else
					times--; 					 
			}
		}
		times=0;
	    for(int i=0;i<array.length;i++)
	    {
	    	if(result==array[i])
	    		times++;	    	
	    }
	    if(times*2<=array.length)
    		return 0;
		return result;
	}
	public static int MoreThanHalfNum_Solution2(int [] array) {
		QuickSort(array,0,array.length-1);
		int middle=array[array.length/2];
		int count=0;
		for(int i=0;i<array.length;i++)
			if(middle==array[i])
				count++;
		if(count<=array.length/2)
			return 0;
		return middle;
	}

	private static void QuickSort(int[] s, int l, int r) {
		// TODO Auto-generated method stub
		if (l < r)  
	    {  
	        int i = l, j = r, x = s[l];  
	        while (i < j)  
	        {  
	            while(i < j && s[j] >= x) // 从右向左找第一个小于x的数  
	                j--;    
	            if(i < j)   
	                s[i++] = s[j];  
	              
	            while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数  
	                i++;    
	            if(i < j)   
	                s[j--] = s[i];  
	        }  
	        s[i] = x;  
	        QuickSort(s, l, i - 1); // 递归调用   
	        QuickSort(s, i + 1, r);  
	    }  
	}
}

