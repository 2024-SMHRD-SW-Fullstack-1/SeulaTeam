package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {

		add(3, 5);
		add(3.5, 4.2);
	}

	// 메소드 오버로딩(=중복정의)
	// 메소드 오버로딩 성립 조건
	// 1. 이름이 같아야 한다.
	// 2. 매개변수의 개수, 혹은 자료형(데이터 타입)이 달라야 한다.
	// 3. 매개변와 메소드의 이름이 동일하고 리턴타입만 다른경우는 오버로딩이 아니다!

	// 메소드는 이름이 똑같아도 상관이 없다!
	private static double add(double num1, double num2) {
		return num1 + num2;
	}

	private static int add(int num1, int num2) {
		return num1 + num2; // 간단한 식은 변수에 않담고 가능

	}

}
