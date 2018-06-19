package nowcoder_2017_09_20;

public class Problems_02_SplitNumberToTwoParts {

	// add some other improve strategies
	public static boolean isMagic(int number) {
		int sum = 0;
		int tmp = number;
		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}
		if ((sum & 1) == 1) {
			return false;
		}
		sum = sum / 2;
		boolean[] dp = new boolean[sum + 1];
		dp[0] = true;
		int cur = 0;
		while (tmp != 0) {
			cur = tmp % 10;
			for (int i = sum; i >= 0; i--) {
				dp[i] = dp[i] || (i - cur >= 0 ? dp[i - cur] : false);
			}
			if (dp[sum]) {
				return true;
			}
			tmp /= 10;
		}
		return false;
	}

	public static void main(String[] args) {
		int test = 242;
		System.out.println(isMagic(test));
	}

}
