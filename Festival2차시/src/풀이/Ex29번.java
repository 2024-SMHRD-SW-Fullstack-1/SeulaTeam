package 풀이;

import java.util.Random;
import java.util.Scanner;

public class Ex29번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int count = 0;
		while (count < 5) {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;

			System.out.print(num1 + "+" + num2 + "=");
			int input = sc.nextInt();

			if (input == num1 + num2) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				count++;
			}
		}
		System.out.println("GAME OVER!");
	}

}
