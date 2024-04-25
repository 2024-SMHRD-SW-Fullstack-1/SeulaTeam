package 풀이;

import java.util.Scanner;

public class Ex30번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기====");
		System.out.print("입력>> ");
		String str = sc.nextLine();

		char[] arr = str.toCharArray();

		int alphabet[] = new int[26];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 97; j <= 122; j++) {
				if (arr[i] == j) {
					alphabet[j - 97] ++;
				}
			}
		}

		for (int i = 97, j = 0; i <= 122; i++, j++) {
			System.out.println((char) (i) + " : " + alphabet[j]);
		}
	}

}
