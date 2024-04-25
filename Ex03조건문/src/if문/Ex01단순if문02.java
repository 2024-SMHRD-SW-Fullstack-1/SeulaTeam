package if문;

import java.util.Scanner;

public class Ex01단순if문02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 금액 : ");
		int input = sc.nextInt();
		System.out.println("사람 명 수 : ");
		int input1 = sc.nextInt();
		
		if(input/input1>=10000) {
			System.out.println("10000원 이상 지불");
		}else {
			System.out.println("10000원 미만 지불");
		}
		

	}

}
