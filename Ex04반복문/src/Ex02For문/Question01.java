package Ex02For문;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();
		
		System.out.println("10으로 나눈 몫 : " + input/10);
		System.out.println("10으로 나눈 나머지 : " + input%10);

	}

}
