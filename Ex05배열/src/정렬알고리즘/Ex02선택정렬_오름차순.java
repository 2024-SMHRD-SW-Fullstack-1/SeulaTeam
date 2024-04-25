package 정렬알고리즘;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {

		int[] arr = { 7, 4, 5, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i; // 지금 까지 본 숫자중 제일 작은수가 있는 인덱스 번호 저장
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;

				}
			}

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			System.out.println(Arrays.toString(arr));
		}

	}

}
