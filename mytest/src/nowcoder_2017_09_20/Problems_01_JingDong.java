package nowcoder_2017_09_20;

public class Problems_01_JingDong {
	public static int getNumber(long n) {
		return (int) Math.ceil((Math.sqrt(1 + 8 * ((double) n)) - 1) / 2);
	}
}
