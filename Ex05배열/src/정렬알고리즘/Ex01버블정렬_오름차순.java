package 정렬알고리즘;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {

		int[] arr = { 7, 4, 5, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) { // i= 0,1,2,3,4 => 5번
			// 1회차 : 제일 큰 숫자를 찾아서 4번 인덱스에 넣어주기
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1]; // 치환
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}

		
		/*
		// 2회차 : 3번인덱스까지만 비교 / 두번째로 큰 숫자를 찾아서 3번 인덱스에 넣어주기
		for (int j = 0; j < arr.length - 2; j++) {
			if (arr[j] > arr[j + 1]) {
				int temp = arr[j + 1]; // 치환
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		if (arr[1] > arr[2]) {
			int temp = arr[2]; // 치환
			arr[2] = arr[1];
			arr[1] = temp;
		}
		if (arr[2] > arr[3]) {
			int temp = arr[3]; // 치환
			arr[3] = arr[2];
			arr[2] = temp;
		}
		
		
		
		if (arr[1] > arr[2]) {
			int temp = arr[2];
			arr[2] = arr[1];
			arr[1] = temp;
		}
		System.out.println(Arrays.toString(arr));

		if (arr[2] > arr[3]) {
			int temp = arr[3];
			arr[3] = arr[2];
			arr[2] = temp;
		}
		System.out.println(Arrays.toString(arr));

		if (arr[3] > arr[4]) {
			int temp = arr[4];
			arr[4] = arr[3];
			arr[3] = temp;
		}
		System.out.println(Arrays.toString(arr));
		*/
	}

}
