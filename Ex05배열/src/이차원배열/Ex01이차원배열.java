package 이차원배열;

public class Ex01이차원배열 {

	public static void main(String[] args) {
		// A,B,C 열 각 좌석은 3칸씩
		int[] A = new int[3];
		int[] B = new int[3];
		int[] C = new int[3];
		// [레퍼런스 배열의 길이 - 저장할 배열의 개수][각 배열에 저장되는 실제 값의 개수]
		int[][] seat = new int[3][];
		seat[0] = A;
		seat[1] = B;
		seat[2] = C;

		// 3칸 짜리 배열이 4개 가 있고 순차적으로 관리'
		int[][] arr = new int[4][3];
		// 2(인덱스)번재 배열의 1번째 칸에 3을 저장하고 싶다
		arr[2][1] = 3;
		// 3번째 배열의 2번째 칸에 5를 저장하고 싶다
		arr[3][2] = 5;
		
////////////////이차원배열의 기본구조//////////
		for (int j = 0; j < arr.length; j++) {
			// 1번째 배열에 저장된 값을 모두 출력
			for (int i = 0; i < arr[j].length; i++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
/////////////////////////////////////////		
		System.out.println();

		// 0번째 배열에 저장된 값을 모두 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[0][i] + " ");
		}
		System.out.println();
		// 1번째 배열에 저장된 값을 모두 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[1][i] + " ");
		}
		System.out.println();
		// 2번째 배열에 저장된 값을 모두 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[2][i] + " ");
		}
		System.out.println();
		// 3번째 배열에 저장된 값을 모두 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[3][i] + " ");
		}
		System.out.println();
	}

}
