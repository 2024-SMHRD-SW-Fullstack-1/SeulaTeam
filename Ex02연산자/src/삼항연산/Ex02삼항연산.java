package 삼항연산;

import java.util.Scanner;

public class Ex02삼항연산 {

	public static void main(String[] args) {
		
		//(조건문(식))?(실행문1-조건신의 결과가 참(true)일때) : (실행문2-조건식의 결과가 거짓(false)일때)
		//정수 1개 입력 -> 홀수/짝수 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int input = sc.nextInt();
		int result = (input%5==0)?input/5:input/5+1;
		
		System.out.print("필요한 상자의 수 : "+result);
		
		
		
		
		
	}

}
