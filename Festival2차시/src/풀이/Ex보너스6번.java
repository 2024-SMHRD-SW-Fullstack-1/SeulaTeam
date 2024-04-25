package 풀이;

public class Ex보너스6번 {

	public static void main(String[] args) {

		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	private static int powerN(int base, int n) {
		int result = 0;
		result = (int) Math.pow(base, n);

		return result;
	}
}
