package Ex01while문;

import java.util.Scanner;

public class Ex01while문06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재 몸무게 : ");
		int num = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int num1 = sc.nextInt();

		int day = 1;
		while (num > num1) {
			System.out.print((day++) + "주차 감량 몸무게 : ");
			int weight = sc.nextInt();
			num -= weight;
			System.out.println("현재 몸무게 : " + num);
		}
		System.out.println("최종몸무게 : " + num);
		System.out.println("축하합니다!!!");
		
		
		
		
		
		
	}
}
