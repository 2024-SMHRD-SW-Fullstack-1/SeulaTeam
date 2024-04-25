package 입출력;

import java.util.Scanner;

public class Ex02입력 {

	public static void main(String[] args) {
		
		//입력한 값을 원하는 형태로 변환해주는 스캐너 도구 까지 생성
		Scanner sc = new Scanner(System.in);
		

		String input = sc.next();
		System.out.println(input);
		
		int input1 = sc.nextInt();
		//alt + 위/아래 방향키 (코드 이동)
		System.out.println(input1);
		System.out.println();
		
		sc.nextLine(); //엔터키를 미리 한번처리 ->버퍼를 비워줌
		String input2 = sc.nextLine();
		System.out.println(input2);						
	}

}
