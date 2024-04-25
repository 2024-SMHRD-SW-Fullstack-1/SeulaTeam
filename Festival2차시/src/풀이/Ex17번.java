package 풀이;

import java.util.Scanner;

public class Ex17번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		for (int i = 0; i <num.length; i++) {
			System.out.print(i+1 + "번 재 정수 입력>> ");
			int input = sc.nextInt();
			num[i] = input;
		}
		System.out.println("3의 배수 : ");
		for(int j=0;j<num.length;j++) {
			if ( num[j]% 3 == 0) {
				System.out.print(num[j] + " ");
			}
		}

	}

}
