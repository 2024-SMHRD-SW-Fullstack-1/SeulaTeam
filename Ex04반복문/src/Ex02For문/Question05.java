package Ex02For문;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		int sum = (input/1000)+(input%1000/100)+(input%100/10)+(input%10);
		System.out.print("각 자리수 합 : " + sum);


		
	}

}
