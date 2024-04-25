package 풀이;

import java.util.Scanner;

public class Ex08번 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		int result = (input+5)/10*10;
		System.out.println(result);
	}
}
