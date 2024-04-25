package 배열;

import java.util.Scanner;

public class Ex01배열09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		int star = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " : ");
			star = arr[i];
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
