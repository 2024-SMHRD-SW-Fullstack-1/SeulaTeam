package 풀이;

import java.util.Scanner;

public class Ex보너스5번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
