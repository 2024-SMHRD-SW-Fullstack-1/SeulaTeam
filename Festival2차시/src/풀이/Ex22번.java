package 풀이;

public class Ex22번 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
