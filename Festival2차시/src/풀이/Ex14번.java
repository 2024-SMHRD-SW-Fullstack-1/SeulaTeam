package 풀이;

import java.util.Scanner;

public class Ex14번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int[][] array = new int[input][input];

		int k = 1;
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (i % 2 == 0) {
					array[i][j] = k;
					k++;
				} else {
					array[i][4 - j] = k;
					k++;
				}
			}
		}

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
