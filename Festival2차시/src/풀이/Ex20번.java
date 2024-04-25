package 풀이;

import java.util.Scanner;

public class Ex20번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력>>");
		int input = sc.nextInt();

		int[] arr = new int[10];
		int i = 0;

		while (input > 0) {
			arr[i] = input % 2;
			input /= 2;
			i++;
		}

		i--;

		for (; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}