package 배열;

import java.util.Random;
import java.util.Scanner;

public class asdf01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num1 = 0;
		int num2 = 0;
		int count = 0;
		while (count < 5) {
			count += 1;
			num1 = rd.nextInt(10) + 1; // 0~9 -> 1~10
			num2 = rd.nextInt(10) + 1; // 0~9 -> 1~10

			System.out.print(num1 + "+" + num2 + "=");
			int input = sc.nextInt();

			if (input == num1 + num2) {
				count -= 1;
				System.out.println("Success!");
			} else {
				System.out.println("Fail...");
			}

		}
		System.out.println("GAME OVER!");
	}

}
