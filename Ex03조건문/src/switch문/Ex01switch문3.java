package switch문;

import java.util.Scanner;

public class Ex01switch문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("월(1~12) 입력 : ");
		int input = sc.nextInt();

		switch (input) {
		case 12,1,2:	//<= 높은버전의 java에서만 사용가능
			System.out.println(input + "월은 겨울입니다");
			break;
		case 3,4,5:
			System.out.println(input + "월은 봄 입니다");
			break;
		case 6,7,8:
			System.out.println(input + "월은 여름 입니다");
			break;
		case 9,10,11:
			System.out.println(input + "월은 가을 입니다");
			break;
		}

		
		
		
		
		
	}

}
