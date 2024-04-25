package 풀이;

import java.util.Scanner;

public class Ex12번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] array = new int[N][N];

		int num = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[j][i] = num;
				num++;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
