package 풀이;

import java.util.Scanner;

public class Ex보너스4번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ":");
			for(int i=0;i<arr[j];i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
