package 배열;

public class Ex01배열07 {

	public static void main(String[] args) {

		String str = "A,A,B,C,D,A,C,D,D,D,F";
		// split을 사용해 특정 문자열을 기준으로 문자열 나누기 =>string[]
		String[] arr = str.split(","); // 특정 문자열을 파라미터로 받아서 해당 문자열을 기준으로 문자열을 잘라 String배열에 넣어주는 기능

		String[] level = { "A", "B", "C", "D", "F" };
		int[] count = { 0, 0, 0, 0, 0 };	//int[] count = new int[5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < level.length; j++) {
				if (arr[i].equals(level[j])) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i < level.length; i++) {
			System.out.println(level[i] + " : " + count[i] + "명");
		}

	}

}
