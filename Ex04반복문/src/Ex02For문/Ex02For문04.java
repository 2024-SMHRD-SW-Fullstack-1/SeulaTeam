package Ex02For문;

public class Ex02For문04 {

	public static void main(String[] args) {

		int sum = 0;
		for (int down = 77, up = 1; down >= 1; down--, up++) {
			sum += (down * up);
			System.out.print(down + "*" + up + "+");
		}
		System.out.println("\n"+sum);
		


	}

}
