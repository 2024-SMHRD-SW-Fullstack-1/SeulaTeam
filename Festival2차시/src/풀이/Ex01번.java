package 풀이;

import java.util.Scanner;

public class Ex01번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int num = sc.nextInt();

		while (weight > num) {
			int day = 1;
			System.out.print((day++) + "주차 감량 몸무게 : ");
			int sub = sc.nextInt();
			weight -= sub;
		}
		System.out.printf("%dkg 달성!! 축하합니다!!", weight);

	}

}
