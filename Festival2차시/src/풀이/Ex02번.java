package 풀이;

import java.util.Scanner;

public class Ex02번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();

		int total = (int) ((time < 9) ? (5000 * time) : ((8 * 5000) + (time - 8) * 5000 * 1.5));
		System.out.printf("총 임금은 %d원입니다.", total);
	}

}
