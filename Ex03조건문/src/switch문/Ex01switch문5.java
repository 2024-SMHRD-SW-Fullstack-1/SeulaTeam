package switch문;

import java.util.Scanner;

public class Ex01switch문5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();

		int change = 0;

		if (menu == 1) {
			change = money - 1800;
			System.out.println("잔돈 : " + change);
		} else if (menu == 2) {
			change = money - 2000;
			System.out.println("잔돈 : " + change);
		} else {
			change = money - 1200;
			System.out.println("잔돈 : " + change);
		}
		if (change>0) {
			System.out.println("잔액이 부족합니다");
		} else {
			System.out.printf("천원:%d\n오백원:%d\n백원%d\n", change / 1000, change % 1000 / 500, change % 500 / 100);
		}
	}
}
