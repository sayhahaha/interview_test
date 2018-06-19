package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
//		int n=input.nextInt();
//		input.nextLine();
//		Set<LinkedList<Integer>> set=new LinkedHashSet<>();
//		for(int i=0;i<n;i++){
//			LinkedList<Integer> list=new LinkedList<>();
//			String strings[]=input.nextLine().split(" ");
//			int temp[]=new int[strings.length];
//			for(int j=0;j<strings.length;j++)
//				temp[j]=Integer.parseInt(strings[j]);
//			Arrays.sort(temp);
//			for(int j=0;j<strings.length;j++)
//				list.add(temp[j]);
//			set.add(list);
//		}
//		Iterator<LinkedList<Integer>> it = set.iterator();
//		while(it.hasNext()){
//			System.out.print(it.next()+" ");
//		}
//		input.close();
		
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		input.nextLine();
		Set<Set<Integer>> set=new LinkedHashSet<>();
		for(int i=0;i<n;i++){
			Set <Integer> subSet=new TreeSet<Integer>();
			String strings[]=input.nextLine().split(" ");
			for(int j=0;j<strings.length;j++)
				subSet.add(Integer.parseInt(strings[j]));
			set.add(subSet);
		}
		Iterator<Set<Integer>> it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		input.close();
	}
	
}