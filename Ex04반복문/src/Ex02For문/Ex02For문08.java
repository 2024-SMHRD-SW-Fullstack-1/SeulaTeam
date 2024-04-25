package Ex02For문;

public class Ex02For문08 {

	public static void main(String[] args) {

		for (int num = 2; num < 10; num++) {
			System.out.println("==" + num + "==");
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + num * i);
			}
		}
/////////////////////////////////////////
		for (int num = 2; num < 10; num++) {
			System.out.print(num + "단 : ");
			for (int i = 1; i < 10; i++) {
				System.out.print(num + "*" + i + "=" + num * i + "   ");
			}
			System.out.println();
		}
/////////////////////////////////////////
		for (int num = 2; num < 10; num++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(num + "*" + j + "=" + num * j + "   " + "\t");
			}

			System.out.println();
		}
	}

}
