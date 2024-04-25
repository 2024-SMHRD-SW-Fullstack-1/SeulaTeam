package 배열;

import java.util.Arrays;

public class Ex01배열01 {

	public static void main(String[] args) {

		// 정수형 배열의 참조값을 저장할 수 있는 (레퍼런스)변수 선언
		int[] arr;

		// 연속적인 7개의 공간을 가진 정수형 배열 생성
		int[] arr1 = new int[7]; // 7개의 공간이 필요함 -> 변경불가

		// 배열의 각 공간에 데이터 저장(0~6)
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		arr1[5] = 60;
		arr1[6] = 70;
		// arr1[7] = 80; -> ArrayIndexOutOfBoundsExecption
		int num = 10;
		// 길이(length) : arr1 배열의 길이 => 7
		System.out.println("길이 : " + arr1.length);

		// 배열을 다루는 for문의 기본 구조
		for (int j = 0; j < arr1.length; j++) {
			arr1[j] = num;
			num += 10;
		}

		// 각 공간에 저장되어 있는 값을 출력 (0~6)
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		System.out.println(arr1[6]);

		for (int i = 0; i < 7; i++) {
			System.out.println(arr1[i]);
		}

		// arr1에 저장된 모든 값의 합, 평균 출력
		int sum = 0;
		for (int j = 0; j < arr1.length; j++) {
			sum += arr1[j];
		}
		System.out.println(sum);
		System.out.println(sum / arr1.length);

		String[] arr2 = { "A", "B", "C" };
		System.out.println(Arrays.toString(arr2));	//출력되는지 확인만 할때 사용

		System.out.println(arr1);
		System.out.println(arr2);
		
		
		
	}

}
