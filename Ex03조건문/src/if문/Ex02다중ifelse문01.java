package if문;

import java.util.Scanner;

public class Ex02다중ifelse문01 {

	public static void main(String[] args) {
		
		//점수 입력
		//91~100 : A / 81~90 : B / 71~80 : C / ~70 : F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 >>");
		int score = sc.nextInt();
		
		if(score>90) {
			System.out.println("A학점");
		}else if(score>80) {
			System.out.println("B학점");
		}else if(score>70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}

	}

}
