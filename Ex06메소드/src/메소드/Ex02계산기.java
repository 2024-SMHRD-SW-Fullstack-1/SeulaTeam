package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입럭 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입럭 : ");
		int num2 = sc.nextInt();
		char op = '*';
		System.out.println(cal(num1, num2, op));

	}

	// private : 다른 클래스에서는 사용할 수 없게 막는 접근제한자
	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '+')
			result = num1 + num2;

		if (op == '-')
			result = num1 < num2 ? num2 - num1 : num1 - num2;

		if (op == '*')
			result = num1 * num2;

		if (op == '/')
			result = num1 < num2 ? num2 / num1 : num1 / num2;

		return result;
	}

}
