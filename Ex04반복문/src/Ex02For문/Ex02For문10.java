package Ex02For문;

import java.util.Scanner;

public class Ex02For문10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		

//////////////////////////////////////////////
		for (int i = 2; i <= 30; i++) {
			System.out.print(i + "의 약수 : ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
