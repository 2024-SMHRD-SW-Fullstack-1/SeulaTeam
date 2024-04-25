package 객체배열;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("물건 개수 입력 : ");
		int input = sc.nextInt();

		Product[] arr = new Product[input];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("물건 이름 : ");
			String name = sc.next();
			System.out.print("단가 : ");
			int unitprice = sc.nextInt();
			System.out.print("수량 : ");
			int amount = sc.nextInt();
			System.out.println();

			arr[i] = new Product(name, unitprice, amount);

		}
		int total = 0;
		System.out.println("제품명\t단가\t수량\t");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j].getName() + "\t" + arr[j].getUnitPrice() + "\t" + arr[j].getAmount() + "\t");
			total += arr[j].getUnitPrice() * arr[j].getAmount();
		}
		System.out.println("총금액 : " + total + "원");

	}

}
