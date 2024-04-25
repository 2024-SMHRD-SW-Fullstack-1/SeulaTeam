package 배열;

import java.util.Random;

public class Ex01배열03 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] arr1 = new int[10];

		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rd.nextInt(20) + 1;
		}

		int max = 0; // 지금까지 내가 본 배열안에 수중에 제일 큰 수 저장
		int min = 20; // 지금까지 내가 본 배열안에 수중에 제일 작은 수 저장
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i])
				max = arr1[i];
			if (min > arr1[i])
				min = arr1[i];
		}

		System.out.print("짝수는 ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.print("\n홀수는 ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0) {
				count++;
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.println("\n홀수는 " + count + "개 입니다.");
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);

	}

}
