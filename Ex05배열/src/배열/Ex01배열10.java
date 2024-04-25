package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01배열10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[3]; // id저장
		String[] pw_array = new String[3]; // pw저장

		System.out.println("===회원가입/로그인시스템===");
		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int input = sc.nextInt();

			int count = 0; // 현재 회원가입을 한 회원 수

			if (input == 1) {
				System.out.println("===회원가입 화면===");
				if (count == 3) {
					System.out.println("===더 이상 회원가입이 불가능합니다===");
				} else {
					System.out.print("ID를 입력---> ");
					id_array[count] = sc.next();
					System.out.print("PW를 입력---> ");
					pw_array[count] = sc.next();
					System.out.println("===입력 성공===");
					count++;
				}

			} else if (input == 2) {
				System.out.println("===로그인 화면===");
				
				
				
			} else if (input == 3) {
				System.out.println("===종료===");
				break;
			} else {
				System.out.println("===올바른 값을 입력하시오===");
			}

		}

	}

}
