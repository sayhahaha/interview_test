package test;

public class MoreThanHalfNum_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 2, 2, 4, 5, 6, 7 };
		System.out.println(MoreThanHalfNum(a));
	}
	public static int MoreThanHalfNum(int [] array) {
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
}
