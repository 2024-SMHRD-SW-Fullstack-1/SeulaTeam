package 산술연산;

import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int time = sc.nextInt();
		
		sc.close();	//스캐너가 사용하고 있는 자원들을 반환하겠다(정리하겠다)
		
		//sc.next(); close한 이후에는 스캐너 재사용불가
		
		int num = time/3600;
		int num1 = (time%3600)/60;
		int num2 = time%60;
		System.out.println("시간 : " + num+"시"+num1+"분"+num2+"초");
		
		//홀수 / 짝수 판단 : 짝수는 2로 나누어떨어지는수
        //홀수는 2로 나눴을 때 나머지가 1인수(0으로 떨어지지 않는 수)
		//조건 : num%2 -> 0 (짝수)  -> 1 (홀수)
		//3의 배수 : 3으로 나누어떨어지는 수
		//조건 : num%3 -> 0 (3의 배수)
		
		int opr = 10;

		System.out.println(opr++);
		System.out.println(opr);
		System.out.println(opr--);
		System.out.println(opr);
		System.out.println(++opr);
		System.out.println(opr);
		System.out.println(--opr);
		System.out.println(opr);
		

	}

}
