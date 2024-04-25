package Ex01while문;

import java.util.Random;
import java.util.Scanner;

public class Ex01while문10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int count = 0;
		int count1 = 0;

		do {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;

			System.out.print(num1 + "+" + num2 + "=");
			int input = sc.nextInt();
			if (input == num1 + num2) {
				System.out.println("Success!");
				count++;
			} else {
				System.out.println("Fail!");
				count1++;
			}

			System.out.print("계속하시겠습니까? (Y/N)");
			String cont = sc.next();

			if (cont.equals("N") || cont.equals("n"))
				break;

		} while (true);

		System.out.println("종료");
		System.out.println("맞춘 개수 : " + count);
		System.out.println("틀린 개수 : " + count1);

	}
}
