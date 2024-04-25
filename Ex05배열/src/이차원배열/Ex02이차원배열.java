package 이차원배열;

public class Ex02이차원배열 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;
		//i -> j -> k
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = num;
				num++;
			}

		}

/*		for (int i = 0; i < arr.length; i++) {
			arr[1][i] = num;
			num++;
		}*/

		for (int j = 0; j < arr.length; j++) {
			// 1번째 배열에 저장된 값을 모두 출력
			for (int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
