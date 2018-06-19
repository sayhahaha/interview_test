package test;

public class solution {
	public static void reOrderArray(int[] array) {
		int t;
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			if (tmp % 2 == 1) {
				for (int j = i; j > 0; j--) {
					if (array[j - 1] % 2 == 0) {
						t = array[j];
						array[j] = array[j - 1];
						array[j - 1] = t;
					}
				}
			}
		}
	}

}
