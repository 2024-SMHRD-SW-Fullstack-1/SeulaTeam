package Ex01while문;

import java.util.Random;
import java.util.Scanner;

public class Ex01while문11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	      Random rd = new Random();
	      
	      int success = 0; //맞춘 개수
	      int fail = 0; //틀린 개수
	      
	      boolean sw = true; //true : 새로운 문제 / false : 이전 문제
	      
	      int num1 = 0, num2 = 0;
	      
	      do {
	         
	         if(sw) { //새로운 문제
	            num1 = rd.nextInt(10)+1; //0~9 -> 1~10
	            num2 = rd.nextInt(10)+1; //0~9 -> 1~10
	         }
	         
	         System.out.print(num1 + " + "+num2+ " = ");
	         int input = sc.nextInt();
	         
	         if(input == (num1+num2)) {
	            System.out.println("Success!");
	            success++;
	            sw = true;
	         }else {
	            System.out.println("Fail!");
	            fail++;
	            sw = false;
	         }
	            
	         System.out.print("계속하시겠습니까? (Y/N)");
	         String cont = sc.next();
	         
	         if(cont.equals("N")||cont.equals("n")) break;
	         
	      }while(true);
	      
	      System.out.println("종료");
	      System.out.println("맞춘 개수 : "+ success);
	      System.out.println("틀린 개수 : "+ fail);
		
	}

}
