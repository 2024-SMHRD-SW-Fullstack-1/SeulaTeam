package 풀이;

import java.util.Scanner;

public class Ex07번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int star = sc.nextInt();

		for (int i = 0; i < star; i++) {
			for(int j=star;j>i;j--) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}

}
