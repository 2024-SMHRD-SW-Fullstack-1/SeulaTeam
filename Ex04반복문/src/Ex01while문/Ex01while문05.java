package Ex01while문;

import java.util.Scanner;

public class Ex01while문05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	      int num = 0;
	      int sum = 0; //입력한 숫자를 모두 더한 값을 저장할 변수
	      
	      int odd = 0; //홀수 갯수
	      int even = 0; //짝수 갯수
	      
	      while(num!=-1) {
	         System.out.print("숫자 입력 : ");
	         num = sc.nextInt();
	         
	         if(num%2==0) {
	            //짝수
	            //even+=1;
	            //even = even+1;
	            even++;
	         }else if(num%2==1){ //num%2==1
	            //홀수
	            odd++;
	         }
	         //sum = sum + num;
	         sum+=num; //누적합
	      }
	      
	      System.out.println("누적 결과 : "+ (sum+1));
	      System.out.println("홀수 갯수 : "+ (odd-1));
	      System.out.println("짝수 갯수 : "+ even);

	}

}
