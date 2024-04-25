package Ex02For문;

public class Ex02For문11 {

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if ((sum - i) == i) {
				System.out.println(i);
			}
		}

	}

}
