package Ex02For문;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단 수 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int input = sc.nextInt();

		System.out.println(dan + "단");
		for (int i = 1; i <= input; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
