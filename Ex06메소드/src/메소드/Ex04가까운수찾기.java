package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}

	private static int close10(int num1, int num2) {
		int result = 0;
		int resultnum1 = 0;
		int resultnum2 = 0;

		if (10 > num1)
			resultnum1 = 10 - num1;
		else
			resultnum1 = num1 - 10;
		if (10 > num2)
			resultnum2 = 10 - num2;
		else
			resultnum2 = num2 - 10;

		if (resultnum1 > resultnum2)
			result = num2;
		else if (resultnum1 < resultnum2)
			result = num1;
		else
			result = 0;

		return result;
	}

	private static int close11(int num1, int num2) {
		int result = 0;
		if (Math.abs(num1 - 10) < Math.abs(num2 - 10)) {
			result = num1;
		} else if (Math.abs(num1 - 10) > Math.abs(num2 - 10)) {
			result = num2;
		} else {
			result = 0;
		}

		return result;
	}

}
