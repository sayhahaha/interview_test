package test;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={4,3,1,0,2,5,3};
		int dup[] ={0};
		if(duplicateNum(a, 7, dup))
		{
			System.out.println(dup[0]);
		}
			
	}

	public static boolean duplicateNum(int numbers[],int length,int [] duplication) {
		int[] assist = new int [length];
		for(int i = 0; i < length; i++){
			if(assist[numbers[i]] == 0){
				assist[numbers[i]] ++;
			}else{
				duplication[0] = numbers[i];
				return true;
			}
		}
		return false;
	}
}

