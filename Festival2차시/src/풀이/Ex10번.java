package 풀이;

import java.util.Random;

public class Ex10번 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] array = new int[8];
		int max = 0;
		int min = 50;

		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100) + 1;
			System.out.print(array[i] + " ");
		}

		for (int j = 0; j < array.length; j++) {
			if(array[j]>max) {
				max = array[j];
			}
			if(array[j]<min) {
				min = array[j];
			}
		}
		System.out.println("\n가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
