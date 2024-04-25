package 배열;

import java.util.Scanner;

public class Ex10문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		System.out.println("정렬 후");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int j=0;j<array.length;j++)
		System.out.print(array[j] + " ");
	}

}
