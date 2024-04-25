package 풀이;

public class Ex28번 {

	public static void main(String[] args) {

		String str = "01001101";
		String[] arr = str.split("");

		int sum = 0;
		int num = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].equals("1")) {
				sum = sum + num * 1;
				num = num * 2;
			} else {
				num *= 2;
			}
		}
		System.out.println(str + "(2)=" + sum + "(10)");
	}
}
