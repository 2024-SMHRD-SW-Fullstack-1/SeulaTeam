package Ex01while문;

import java.util.Scanner;

public class Ex01while문09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("정수1 : ");
			int input = sc.nextInt();

			System.out.print("정수2 : ");
			int input1 = sc.nextInt();

			System.out.print("연산자(+/-) : ");
			String input3 = sc.next();

			if (input3.equals("+")) {
				System.out.println(input + "+" + input1 + "=" + (input + input1));
			} else if (input3.equals("-")) {
				System.out.println(input + "-" + input1 + "=" + (input - input1));
			}
			System.out.print("계속하시겠습니까? (Y/N)");
			String cont = sc.next();

			if (cont.equals("N") || cont.equals("n"))
				break;
		} while (true);
		System.out.println("종료");
	}
}
