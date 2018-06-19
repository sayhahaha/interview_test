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
//                // �˴�������Ҫ��Ϊ�������ֵ���ȫ���У�����ݹ������ֵ���
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
            // ���һ��ȫ����
            Output(words);
            fromIndex = endIndex = words.length - 1;
            // ��ǰ���ҵ�һ����С��Ԫ��
            while (fromIndex > 0 && words[fromIndex] <= words[fromIndex - 1]) --fromIndex;
            changeIndex = fromIndex;
            if (fromIndex == 0) break;
            // ���������һ������words[fromIndex-1]��Ԫ��
            while (changeIndex + 1 < words.length && words[changeIndex + 1] >= words[fromIndex - 1]) ++changeIndex;
            Swap(words,fromIndex - 1, changeIndex);   // ��������ֵ
            InvertArray(words,fromIndex, endIndex);   // �Ժ��������ֵ���з�����
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
	            // �����кõ����μ��뼯��
	            arr.add(new String(words));
	            fromIndex = endIndex = words.length - 1;
	            // ��ǰ���ҵ�һ����С��Ԫ��
	            while (fromIndex > 0 && words[fromIndex] <= words[fromIndex - 1]) --fromIndex;
	            changeIndex = fromIndex;
	            if (fromIndex == 0) break;
	            // ���������һ������words[fromIndex-1]��Ԫ��
	            while (changeIndex + 1 < words.length && words[changeIndex + 1] >= words[fromIndex - 1]) ++changeIndex;
	            Swap(words,fromIndex - 1, changeIndex);   // ��������ֵ
	            InvertArray(words,fromIndex, endIndex);   // �Ժ��������ֵ���з�����
	        } while (true);
			return arr;     
	    }
}
