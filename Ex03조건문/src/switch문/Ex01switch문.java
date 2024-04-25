package switch문;

import java.util.Scanner;

public class Ex01switch문 {

	public static void main(String[] args) {

		// 숫자 1개 입력 입력한 숫자+3 의 결과를 출력하는 구문 -> switch case문

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 >> ");
		int input = sc.nextInt(); // 1~

		switch (input + 3) {
		case 4: // input : 1
			System.out.println("결과 : 4");
			break; // switch, 반복문 : 가장 가까운 조건(반복)문을 나가는 키워드
		case 5: // input : 2
			System.out.println("결과 : 5");
			break;
		case 6: // input : 3
			System.out.println("결과 : 6");
			break;
		default: // input : 4이상
			System.out.println("결과라 7이상이다");
		}

	}

}
