package 풀이;

public class Ex보너스2번 {

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));

	}

	private static String getMiddle(String word) {
		String[] arr = word.split("");
		String result;
		if (arr.length % 2 == 0) {
			result = arr[(arr.length / 2) - 1] + arr[arr.length / 2];
		} else {
			result = arr[arr.length / 2];
		}
		return result;
	}

}
