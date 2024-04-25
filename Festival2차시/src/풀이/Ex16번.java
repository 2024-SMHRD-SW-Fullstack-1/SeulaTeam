package 풀이;

import java.util.Scanner;

public class Ex16번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		int result = input;
		int sum = 0;
		while (result > 0) {
			sum += result%10;
			result = result/10;
		}
		System.out.println(sum);
	}

}
