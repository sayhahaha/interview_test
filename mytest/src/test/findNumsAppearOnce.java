package test;

public class findNumsAppearOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={2,3,4,4,3,5,5,7};
		int[] num1 = {0};
		int[] num2 = {0};
		FindNumsAppearOnce(a,num1,num2);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
	}
	public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		int s=0;
        for(int i=0;i<array.length;i++)
        {
        	s=s^array[i];
        }
        int indexOf1=FindFirstBitIs1(s);
        num1[0]=0;
        num2[0]=0;
        for(int j=0;j<array.length;j++)
        {
        	if(isBit1(array[j],indexOf1)==1)
        		num1[0]^=array[j];
        	else
        		num2[0]^=array[j];
        }
    }
	private static int isBit1(int i, int indexOf1) {
		// TODO Auto-generated method stub
		i=i>>indexOf1;       
		return (i&1);
	}
	private static int FindFirstBitIs1(int s) {
		// TODO Auto-generated method stub
		int indexBit=0;
		while((s&1)==0)
		{		
			indexBit++;
			s=s>>1;
		}
		return indexBit;
	}
}
