package test;
/**
���ӣ�https://www.nowcoder.com/questionTerminal/7036f62c64ba4104a28deee98a6f53f6
��Դ��ţ����

��һ����������A��������ֵ��ͬ��ֽ���ų�һ���ߡ����a�����b��������ÿ��ֽ�ƣ��涨���a���ã����B���ã�����ÿ�����ÿ��ֻ��������������ҵ�ֽ�ƣ����a�����b�����������������ܻ�������Ų��ԡ��뷵������ʤ�ߵķ�����
����ֽ������A�����еĴ�Сn���뷵���������ϸ��ߵ÷���(��ͬ�򷵻�����һ������)����֤A�е�Ԫ�ؾ�С�ڵ���1000����A�Ĵ�СС�ڵ���300��
����������
[1,2,100,4],4
���أ�101
 */
import java.util.Scanner;

/**
 * @author xiaohao
 * @date ����ʱ�䣺Jul 21, 2017 10:27:45 AM
 * @version 1.0
 */
public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = in.nextInt();
			System.out.println(cardGame(arr, n));
		}
	}

	private static int cardGame(int[] arr, int n) {
		// TODO Auto-generated method stub
		// f[i][j]��ʾ����[i...j]�£���ѡ�ܻ�õ�������
        // s[i][j]��ʾ����[i...j]�£���ѡ�ܻ�õ�������
		int[][] f = new int[n][n];
		int[][] s = new int[n][n];
		for (int j = 0; j < n; j++) {
			f[j][j] = arr[j];
			for (int i = j - 1; i >= 0; i--) {
				f[i][j] = Math.max(arr[i] + s[i + 1][j], arr[j] + s[i][j - 1]);
				s[i][j] = Math.min(f[i + 1][j], f[i][j - 1]);// ����ֻ�ܻ�ý�С�ķ�����˫�����ܴ�������ѡ��Ȼֻ�ܻ�ý��ٵķ�����
			}
		}
		return Math.max(f[0][n - 1], s[0][n - 1]);
	}
}
