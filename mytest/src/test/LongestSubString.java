package test;

import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Mar 13, 2018 8:37:07 PM  
*/
public class LongestSubString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num-->0){
			String A=sc.next();
			String B=sc.next();
			System.out.println(findLongest(A,B));
		}
	}

	public static int findLongest(String A, String B) {
		// write code here
		int result = 0; // 记录最长公共子串长度
		int n=A.length();
		int m=B.length();
		int c[][] = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i == 0 || j == 0) {
					c[i][j] = 0;
				} else if (A.charAt(i - 1) == B.charAt(j - 1)) {
					c[i][j] = c[i - 1][j - 1] + 1;
					result = Math.max(c[i][j], result);
				} else {
					c[i][j] = 0;
				}
			}
		}
		return result;
	}
}
