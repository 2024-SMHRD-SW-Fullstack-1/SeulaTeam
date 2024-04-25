package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BookData> al = new ArrayList<BookData>();

		while (true) {
			System.out.print("1)책 추가 2)책 삭제 3)내가 살 수 있는 책 4)종료 ");
			int num = sc.nextInt();

			if (num == 1) {
				for (int i = 0; i < 5; i++) {
					System.out.print("책 이름 : ");
					String name = sc.next();
					System.out.print("가격 : ");
					int price = sc.nextInt();
					System.out.print("작가 : ");
					String writer = sc.next();
					
					al.add(new BookData(name, price, writer));
				}
			}
		}

	}

}
