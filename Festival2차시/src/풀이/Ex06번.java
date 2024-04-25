package 풀이;

public class Ex06번 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 77, j = 1; i > 0 && j < 78; i--, j++) {
			System.out.print(i + "*" + j+" + ");
			sum += i * j;
		}
		System.out.println("\n" + sum);
	}

}
