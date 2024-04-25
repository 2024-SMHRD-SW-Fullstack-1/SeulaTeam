package 산술연산;

import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : " );
		int num = sc.nextInt();
		
		System.out.print("WEB 점수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("ANDROID 점수 입력 : ");
		int num2 = sc.nextInt();
		
		int totalScore = num+num1+num2;
		
		System.out.println("합계 : " + totalScore);
		System.out.println("평균 : " + ((float)(num+num1+num2)/3));
		System.out.println("평균 : " + (totalScore/3.0));
		
		System.out.printf("평균 : %.2f\n", (totalScore/3.0));
		
		System.out.println(Math.round((totalScore/3.0)*100)/100.0);
		
		
		
		
		
		
	}

}
