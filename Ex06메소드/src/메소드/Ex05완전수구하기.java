package 메소드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isdivisor(num1, num2);
		System.out.println(divisor);

		System.out.println(getSun(7));
		System.out.println(getSun(44));

		System.out.println(isperfect(7));
		System.out.println(isperfect(6));
	}

	private static boolean isdivisor(int num1, int num2) {
		boolean result = false;
		if (num1 % num2 == 0) {
			result = true;
		}
		return result;
	}

	// 메소드 구조 안에 메소드를 새롭게 구현할 수 없으나
	// 메소드 자체를 호출하여 사용하는 것은가느하다!

	private static int getSun(int i) {
		int result = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				result += j;
			}
		}
		return result;
	}

	private static boolean isperfect(int i) {
		boolean result = false;

		if (getSun(i) == i) {
			result = true;
		}
		return result;
	}
}
