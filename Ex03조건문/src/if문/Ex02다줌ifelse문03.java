package if문;

import java.util.Scanner;

public class Ex02다줌ifelse문03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("잔액 : ");
		int num = sc.nextInt();
		System.out.println("성인/청소년/어린이 : ");
		String input = sc.next();

		// ctrl + shift + f : 줄 자동정렬(코드에 오류가 없어야함)
		
		if (input.equals("성인") && num >= 1800) {
			System.out.println("감사합니다");
		} else if (input.equals("청소년") && num >= 1500) {
			System.out.println("반갑습니다");
		} else if (input.equals("어린이") && num >= 1000) {
			System.out.println("안녕하세요");
		} else {
			System.out.println("잔액이 부족합니다");
		}
		
	}

}
