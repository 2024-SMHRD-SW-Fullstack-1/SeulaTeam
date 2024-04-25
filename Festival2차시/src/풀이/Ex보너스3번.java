package 풀이;

public class Ex보너스3번 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));
	}

	private static int cal(int num1, int num2, char op) {
		int result = num1-num2;
		return result;
	}

}
