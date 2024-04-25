package 풀이;

import java.util.Scanner;

public class Ex27번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== 채점하기 ====");
		String input = sc.next();

		String[] arr = input.split("");

		int score = 0;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case"o":
				score++;
				sum +=score;
				break;
			case"x":
				score=0;
				break;
			}
		}
		System.out.println(sum);
	}

}
