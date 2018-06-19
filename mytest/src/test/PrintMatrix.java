package test;

import java.util.ArrayList;

public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [][]a={{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
		int [][]a={{1,2},{3,4},{5,6},{7,8},{9,10}};
		ArrayList<Integer> list=printMatrix(a);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+",");
		}
	}
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		int row=matrix.length;
		int col=matrix[0].length;
		if(row==0)
			return result;
		int circle=(Math.min(row, col)-1)/2+1; //遍厉圈数
		for(int i=0;i<circle;i++)
		{
			for(int j=i;j<col-i;j++)
				result.add(matrix[i][j]);  //从左到右
			for(int k=i+1;k<row-i;k++)
				result.add(matrix[k][col-i-1]);    //右上到右下
			for(int j=col-i-2;j>=i&&(row-i-1!=i);j--)
				result.add(matrix[row-i-1][j]);    //从右到左
			for(int k=row-i-2;k>i&&col-i-1!=i;k--)
				result.add(matrix[k][i]);    //左下到左上
		}
		return result;
    }
}
