package 배열;

import java.util.Random;

public class Ex01문제 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr1 = new int[8];
		int max = 0;
		int min = 100;

		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rd.nextInt(100) + 1;
			System.out.print(arr1[i] + " ");
		}
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			if (min > arr1[i]) {
				min = arr1[i];
			}

		}
		System.out.println("\n가장 큰값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
