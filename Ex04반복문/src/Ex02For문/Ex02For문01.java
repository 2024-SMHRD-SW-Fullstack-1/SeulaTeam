package Ex02For문;

import java.util.Scanner;

public class Ex02For문01 {

	public static void main(String[] args) {

		/*
		 * for(int i=1, j=2; i<=10||j<=10; i++, j++) { System.out.println(i);
		 * System.out.println(j); }
		 * 
		 * for (int i = 21; i <= 57; i++) { System.out.println(i); }
		 * 
		 * for (int i = 96; i >= 53; i--) { System.out.println(i); }
		 * 
		 * for(int i=21;i<=57;i+=2) { System.out.println(i); }
		 */

		Scanner sc = new Scanner(System.in);

		/*
		 * int num = sc.nextInt();
		 * 
		 * for (int i = 1; i <= num; i++) { System.out.println(i); }
		 */

		 int num1 = sc.nextInt();
	      int num2 = sc.nextInt();
	     

	      int big = (num1>num2)?num1:num2;
	      int small = (num1>num2)?num2:num1;
		int sum = 0;

		for (int a = small; a <= big; a++) {
			System.out.println(a);
			sum += a;
		}
		System.out.println(sum);

	}
}
