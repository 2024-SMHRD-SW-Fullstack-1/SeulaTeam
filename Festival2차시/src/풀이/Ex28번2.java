package 풀이;

public class Ex28번2 {

	public static void main(String[] args) {

		String str = "01001101";
		String[] arr = str.split("");

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case "0":
				break;
			case "1":
				sum += Math.pow(2, arr.length - 1 - i);
			}
		}
		System.out.printf("%s(2) = %d(10)", str, sum);
	}

}
