package 배열;

import java.util.Scanner;

public class Ex01배열04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      
	      //1. 정수형 10개 담을 수 있는 배열 생성
	      int[] arr = new int[5];
	      
	      for(int i=0; i<arr.length; i++) {
	         System.out.print(i+1+"번째 입력 >> ");
	         arr[i] = sc.nextInt();
	      }
	      
	      int max = arr[0]; //최고 점수
	      int min = arr[0]; //최저 점수 
	      int sum = 0; // 총합
	      System.out.print("입력된 점수 : " );
	      for(int i=0; i<arr.length; i++) {
	         System.out.print(arr[i]+" ");
	         if(max < arr[i]) max = arr[i];
	         if(min > arr[i]) min = arr[i];
	         sum += arr[i];
	      }
	      
	      System.out.println("\n최고 점수 : "+ max);
	      System.out.println("최저 점수 : "+ min);
	      System.out.println("총합 : "+ sum);
	      System.out.println("평균 : "+ sum/arr.length);

	}

}
