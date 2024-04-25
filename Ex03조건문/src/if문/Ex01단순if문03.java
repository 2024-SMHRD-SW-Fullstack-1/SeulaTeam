package if문;

import java.util.Scanner;

public class Ex01단순if문03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소프트웨어 설계 : ");
		int input = sc.nextInt();
		System.out.println("소프트웨어 개발 : ");
		int input1 = sc.nextInt();
		System.out.println("데이터베이스 구축 : ");
		int input2 = sc.nextInt();
		System.out.println("프로그래밍 언어 활용 : ");
		int input3 = sc.nextInt();
		System.out.println("정보시스템 구축 관리 : ");
		int input4 = sc.nextInt();
		
		int totalscore = input+input1+input2+input3+input4;
		
		if(input<8||input1<8||input2<8||input3<8||input4<8||totalscore<60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
	}

}
