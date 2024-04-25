package 삼항연산;

import java.util.Scanner;

public class Ex03삼항연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노동시간 >> ");
	      int input = sc.nextInt();

	      int result = (int)((input>8)? 9000*8+(input-8)*9000*1.5 :9000*input);
	      System.out.println("총 임금 : "+ result+"원");
		
		
		

	}

}
