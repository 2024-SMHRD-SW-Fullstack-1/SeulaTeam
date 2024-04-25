package 배열;

import java.util.Scanner;

public class EX01배열06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	      int[] answer = { 1, 4, 3, 2, 1 };
	      int[] arr = new int[5];
	      int score = 0;

	      System.out.println("==채점하기==");
	      System.out.println("답을 입력하세요");

	      for (int i = 0; i < answer.length; i++) {
	         System.out.print(i + 1 + "번답 >>");
	         arr[i] = sc.nextInt();
	      }
	      System.out.println("정답확인");
	      for (int j = 0; j < answer.length; j++) {
	         if (answer[j] == arr[j]) {
	            System.out.print("O ");
	            score++;
	         } else
	            System.out.print("X ");
	      }
	      System.out.println("총점 : " + score*20);

	}
}
