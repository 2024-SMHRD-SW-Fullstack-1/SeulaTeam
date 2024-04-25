package Ex02For문;

import java.util.Scanner;

public class Ex02For문07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("범위 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1;i<=input;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
