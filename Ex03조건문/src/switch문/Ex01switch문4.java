package switch문;

import java.util.Scanner;

public class Ex01switch문4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();

		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("잔돈 : " + (money = money - 1800));
			break;
		case 2:
			System.out.println("잔돈 : " + (money = money - 2000));
			break;
		case 3:
			System.out.println("잔돈 : " + (money = money - 1200));
			break;
		default :
		}
		System.out.printf("천원:%d\n오백원:%d\n백원%d\n", money / 1000, money % 1000 / 500, money % 500 / 100);
	}

}
