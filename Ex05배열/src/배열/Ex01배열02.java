package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01배열02 {

	public static void main(String[] args) {

		// 1. 랜덤값으로 배열 초기화하기
		Random rd = new Random(); // <- 레퍼런스 변수 rd가 new Random의 위치를 레퍼런스
		int num = rd.nextInt(100) + 1; // 1~100가지수
		// 배열의[0] 인덱스에 위에서 뽑은 랜덤수를 저장

		int[] arr1 = new int[5];
		arr1[0] = num;
		System.out.println(arr1[0]);
		arr1[1] = rd.nextInt(100) + 1;

		// 1-1. 반복문 사용해서 arr1 배열을 랜덤값으로 초기화하기
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rd.nextInt(100) + 1;
		}

		// 1-2. 반복문 사용해서 arr1 배열에 저장된 값 출력하기
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(Arrays.toString(arr1));

		// 2. 사용자가 입력한 값으로 배열 초기화하기
		Scanner sc = new Scanner(System.in);
		int[] arr2 = new int[5];

		// 0번 인덱스에 사용자가 입력한 값으로 초기화
		//int num1 = sc.nextInt();
		//arr2[0] = num1;

		//arr2[1] = sc.nextInt();
		// 2-1. 반복문 사용해서 arr2 배열 초기화
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		// 2-2. 반복문 사용해서 arr2 값 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("입력값 : " + arr2[i]);
		}
	}

}
