package test;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
	
//	private static int MAXLENGTH = 20;
//    private static int length;
//    private static char[] words = new char[MAXLENGTH];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		char []words=str.toCharArray();
			
		Permutation(words,0,words.length-1);
//		Arrays.sort(words,0, 4);
//		for (int index = 0; index < length; ++index)
//            System.out.print(words[index] + " ");
//		System.out.print(words[0]);
//		Output(words);
	}
//    private static void PermutationList(char [] words,int fromIndex, int endIndex)
//    {
//        if (fromIndex == endIndex)
//            Output(words);
//        else
//        {
//            for (int index = fromIndex; index <= endIndex; ++index)
//            {
//                // 此处排序主要是为了生成字典序全排列，否则递归会打乱字典序
//                Sort(words,fromIndex, endIndex);
//                Swap(words,fromIndex, index);
//                PermutationList(words,fromIndex + 1, endIndex);
//                Swap(words,fromIndex, index);
//            }
//        }
//    }
    private static void PermutationList(char [] words,int fromIndex, int endIndex)
    {
        int changeIndex;
        Sort(words,0, words.length - 1);
        do
        {
            // 输出一种全排列
            Output(words);
            fromIndex = endIndex = words.length - 1;
            // 向前查找第一个变小的元素
            while (fromIndex > 0 && words[fromIndex] <= words[fromIndex - 1]) --fromIndex;
            changeIndex = fromIndex;
            if (fromIndex == 0) break;
            // 向后查找最后一个大于words[fromIndex-1]的元素
            while (changeIndex + 1 < words.length && words[changeIndex + 1] >= words[fromIndex - 1]) ++changeIndex;
            Swap(words,fromIndex - 1, changeIndex);   // 交换两个值
            InvertArray(words,fromIndex, endIndex);   // 对后面的所有值进行反向处理
        } while (true);
    }
    private static void InvertArray(char[]words,int fromIndex, int endIndex) {
		// TODO Auto-generated method stub
		for(;fromIndex<endIndex;fromIndex++,endIndex--)
			Swap(words,fromIndex,endIndex);
	}

	private static void Swap(char[]words,int indexX, int indexY)
    {
        if (indexX != indexY)
        {
            char ch = words[indexX];
            words[indexX] = words[indexY];
            words[indexY] = ch;
        }
    }
	private static void Output(char[]words) {
		// TODO Auto-generated method stub
		for (int index = 0; index < words.length; ++index)
            System.out.print(words[index]);
		System.out.println();
	}

	private static void Sort(char [] words,int fromIndex, int endIndex) {
		// TODO Auto-generated method stub
		 Arrays.sort(words, fromIndex, endIndex - fromIndex + 1);
	}
   
	
	
	 public static ArrayList<String> Permutation(char [] words,int fromIndex, int endIndex) {
		 	int changeIndex;
		 	ArrayList <String> arr=new ArrayList<String>();
	        Sort(words,0, words.length - 1);
	        do
	        {
	            // 将排列好的依次加入集合
	            arr.add(new String(words));
	            fromIndex = endIndex = words.length - 1;
	            // 向前查找第一个变小的元素
	            while (fromIndex > 0 && words[fromIndex] <= words[fromIndex - 1]) --fromIndex;
	            changeIndex = fromIndex;
	            if (fromIndex == 0) break;
	            // 向后查找最后一个大于words[fromIndex-1]的元素
	            while (changeIndex + 1 < words.length && words[changeIndex + 1] >= words[fromIndex - 1]) ++changeIndex;
	            Swap(words,fromIndex - 1, changeIndex);   // 交换两个值
	            InvertArray(words,fromIndex, endIndex);   // 对后面的所有值进行反向处理
	        } while (true);
			return arr;     
	    }
}
