package 배열;

import java.util.Scanner;

public class Ex02문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] arr1 = new int[5][5];
		int k = 1;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[j][i] = k;
				k++;
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
