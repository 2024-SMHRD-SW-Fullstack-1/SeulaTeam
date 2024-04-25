package Ex02For문;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 >> ");
		int input = sc.nextInt();
		
		if(input<41) {
			System.out.println("초년입니다.");
		}else if(input<61) {
			System.out.println("중년입니다.");
		}else if(input>=61){
			System.out.println("노년입니다.");
		}
		

	}

}
