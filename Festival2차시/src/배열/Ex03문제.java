package 배열;

public class Ex03문제 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");

		String[] level = { "A", "B", "C", "D", "F" };
		int[] count = { 0, 0, 0, 0, 0 };

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
