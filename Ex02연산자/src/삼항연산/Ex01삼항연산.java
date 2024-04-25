package 삼항연산;

import java.util.Scanner;

public class Ex01삼항연산 {

	public static void main(String[] args) {
		
		//(조건문(식))?(실행문1-조건신의 결과가 참(true)일때) : (실행문2-조건식의 결과가 거짓(false)일때)
		//정수 1개 입력 -> 홀수/짝수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();
		
		String result = (input%2==0)?"짝수":"홀수";
		System.out.println("결과 : "+result);
		System.out.println("결과 : "+((input%2==0)?"짝수":"홀수"));
		
		
		
		System.out.print("첫번째 정수 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int input2 = sc.nextInt();
		
		int result1 = (input1>input2)?input1-input2:input2-input1;
		System.out.println("두 수의 차 : " + result1);
		
		
		
		
		

	}

}
