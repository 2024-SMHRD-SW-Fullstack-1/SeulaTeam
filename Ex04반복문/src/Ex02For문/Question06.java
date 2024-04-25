package Ex02For문;

public class Question06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 6; j > 1 - i; j--) {
				if (j > i) {
					System.out.print(" ");
				} else
					System.out.print("*");

			}
			System.out.println();
		}

	}

}