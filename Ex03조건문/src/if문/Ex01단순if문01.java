package if문;

import java.util.Scanner;

public class Ex01단순if문01 {

	public static void main(String[] args) {
		
		//1. 나이를 입력 받기
		//2. 20보다 크거나 같으면 "성인입니다" / 그 외 아무것도 출련 x
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();
		
		if(age>=20) {
			
			System.out.println("성인입니다");
		}
		System.out.println("프로그램 종료");

		///////////
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num%3==0||num%5==0) {
			System.out.println("3 또는 5의 배수입니다.");
		}
		
		//////////
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int python = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int android = sc.nextInt();
		
		int avg = (java + python + android)/3;
		
		if(avg>80) {
			System.out.println("합격");
		}
		
		//{}실행문장이 1줄일때만 사용
		if(avg>80) System.out.println("합격");	
		else System.out.println("불합격");
		//////
		
	}

}
