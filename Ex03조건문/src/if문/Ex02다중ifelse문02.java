package if문;

import java.util.Scanner;

public class Ex02다중ifelse문02 {

	public static void main(String[] args) {
		
		//문자열 입력
		//A -> A입력
		//B -> B입력
		//A,B 외 알파벳 -> A,B외 입력
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		// ==(비교연산자:같은지) : 기본타입(자료형 primitive type) 비교시에만 사용
		//1.기본형(primitive type) : boolean, char, byte, short, int, long, float, double
		//2.참조형(reference type) : 자기 만의 기능을 가짐
		if(input.equals("A")) {
			System.out.println("A입력");
		}else if(input.equals("B")) {
			System.out.println("B입력");
		}else {
			System.out.println("A,B외 입력");
		}

	}

}
