package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("물건 개수 입력 : ");
	      int num = sc.nextInt();
	      
	      ArrayList<Product> al = new ArrayList<Product>();
	      
	      for(int i=0; i<num; i++) {
	         System.out.print(i+1+") 물건이름 : ");
	         String name = sc.next();
	         System.out.print(i+1+") 단가 : ");
	         int price = sc.nextInt();
	         System.out.print(i+1+") 수량 : ");
	         int amount = sc.nextInt();
	         
	         al.add(new Product(name, price, amount));
	      }

	      int total = 0; // 총금액 저장 변수
	      System.out.println("제품명\t단가\t수량");
	      for(int i=0; i<al.size(); i++) {
	         System.out.println(al.get(i).getName()+"\t"+al.get(i).getUnitPrice()+"\t"+al.get(i).getAmount());
	         total += al.get(i).getUnitPrice() * al.get(i).getAmount();
	      }
	      System.out.println("총금액 : "+ total+"원");

	}

}
