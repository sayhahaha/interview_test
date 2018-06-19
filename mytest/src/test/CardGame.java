package test;
/**
链接：https://www.nowcoder.com/questionTerminal/7036f62c64ba4104a28deee98a6f53f6
来源：牛客网

有一个整型数组A，代表数值不同的纸牌排成一条线。玩家a和玩家b依次拿走每张纸牌，规定玩家a先拿，玩家B后拿，但是每个玩家每次只能拿走最左或最右的纸牌，玩家a和玩家b都绝顶聪明，他们总会采用最优策略。请返回最后获胜者的分数。
给定纸牌序列A及序列的大小n，请返回最后分数较高者得分数(相同则返回任意一个分数)。保证A中的元素均小于等于1000。且A的大小小于等于300。
测试样例：
[1,2,100,4],4
返回：101
 */
import java.util.Scanner;

/**
 * @author xiaohao
 * @date 创建时间：Jul 21, 2017 10:27:45 AM
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
		// f[i][j]表示在牌[i...j]下，先选能获得的最大分数
        // s[i][j]表示在牌[i...j]下，后选能获得的最大分数
		int[][] f = new int[n][n];
		int[][] s = new int[n][n];
		for (int j = 0; j < n; j++) {
			f[j][j] = arr[j];
			for (int i = j - 1; i >= 0; i--) {
				f[i][j] = Math.max(arr[i] + s[i + 1][j], arr[j] + s[i][j - 1]);
				s[i][j] = Math.min(f[i + 1][j], f[i][j - 1]);// 后手只能获得较小的分数（双方都很聪明，后选当然只能获得较少的分数）
			}
		}
		return Math.max(f[0][n - 1], s[0][n - 1]);
	}
}
