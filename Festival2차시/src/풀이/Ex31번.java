package 풀이;

public class Ex31번 {

	public static void main(String[] args) {

		// 팩토리얼
		// 재귀함수 : 함수 안에 자신의 함수를 다시 호출하는 함수

		int input = 10;
		System.out.println("입력 : " + input);
		System.out.println("출력 : " + fact(input));
	}

	private static int fact(int input) {
		int result = 0;
		if (input <= 1) {
			result = input;
		}else {
			result = input*fact(input-1);
		}

		return result;
	}

}
