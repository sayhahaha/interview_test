package nowcoder_2017_09_20;

public class Problems_04_Parentheses {

	public static int possibilities(String parentheses) {
		char[] chas = parentheses.toCharArray();
		int cur = 0;
		int ans = 1;
		for (int i = chas.length - 1; i >= 0; i--) {
			if (chas[i] == ')') {
				cur++;
			} else {
				ans *= cur--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String test1 = "(((())))";
		System.out.println(possibilities(test1));

		String test2 = "()()()()()";
		System.out.println(possibilities(test2));
	}

}
