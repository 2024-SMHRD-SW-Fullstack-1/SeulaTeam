package Ex01while문;

import java.util.Scanner;

public class Ex01while문03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num=0;
		int sum=0; //입력한 숫자를 모두 더한 값을 저장할 변수
		while(num!=-1) {
			System.out.print("숫자입력 : ");
			num=sc.nextInt();
			//sum = sum+num;
			sum+=num;	//누접합
		}
		System.out.println("누적결과 : "+(sum+1));
		
		int num1=0;
		int sum1=0; //입력한 숫자를 모두 더한 값을 저장할 변수
		while(true) {
			System.out.print("숫자입력 : ");
			num1=sc.nextInt();
			//sum = sum+num;
			sum1+=num1;	//누접합
			if(num1==-1) {
				break;
			}
		}
		System.out.println("누적결과 : "+(sum1+1));
		
	}

}
