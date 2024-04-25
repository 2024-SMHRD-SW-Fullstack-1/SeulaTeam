package Ex01while문;

import java.util.Scanner;

public class Ex01while문02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input=0;
		while(input<10) {
			System.out.print("숫자입력 : ");
			input = sc.nextInt();
		}
		System.out.println("종료");
		
		int input1=0;
		do {
			System.out.print("숫자입력 : ");
			input1 = sc.nextInt();
		}while(input1<10);
		
		System.out.println("종료");
		
		
	}

}
