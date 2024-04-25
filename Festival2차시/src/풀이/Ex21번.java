package 풀이;

public class Ex21번 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int min = Math.abs(point[0] - point[1]);

		int a = 0;
		int b = 0;

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (min > Math.abs(point[i] - point[j])) {
					min = Math.abs(point[i] - point[j]);
					a = i;
					b = j;
				}

			}
		}
		System.out.println(a + "," + b);

	}

}
