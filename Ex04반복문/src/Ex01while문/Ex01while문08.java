package Ex01while문;

import java.util.Scanner;

public class Ex01while문08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int failCnt = 0; // 로그인 실패 횟수

		do {
			System.out.print("아이디 : ");
			String inputId = sc.next();

			System.out.print("비밀번호 : ");
			String inputPw = sc.next();

			if (inputId.equals("smhrd") && inputPw.equals("1234")) {
				// 성공
				System.out.println("로그인 성공");
				break; // 프로그램 종료
			} else {
				// 실패
				System.out.println("로그인 실패");
				failCnt++;

				if (failCnt == 3) {
					System.out.println("본인인증을 해주세요");
					break;
				}

				System.out.print("계속 하시겠습니까?");
				String input = sc.next();

				if (input.equals("N") || input.equals("n"))
					break;
			}

		} while (true);

	}

}
