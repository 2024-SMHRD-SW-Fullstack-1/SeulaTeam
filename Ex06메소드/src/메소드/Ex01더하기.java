package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기(main영역 안쪽에서 사용하기
		double result = addDouble(3.14, 4.2);
		System.out.println(result);

		int result2 = subNum(7, 10);
		System.out.println(result2);

		System.out.println(subNum(7, 10));
		
		printHello();
	}
	// 메소드 생성(main 영역을 벗어나서 작성)
	// 1. 더하기
	// 리턴타입 : double / 메소드명 : addDouble / 매개변수 : double 2개

	public static double addDouble(double n1, double n2) {
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에만 코드를 작성할것!!
		double result = n1 + n2;
		return result; // return : 최종적(마지막)으로 반환할 값

	}
	// 2. 빼기
	// 리턴타입 : int /메소드명 : subNum / 매개변수 : int타입 2개
	// 매개변수로 받아온 데이터 2개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰 수에서 작은 수를 뺀 결과값을 돌려주기

	public static int subNum(int n1, int n2) {
		int result = 0;
		result = (n1 > n2) ? (n1 - n2) : (n2 - n1);
		return result;
	}

	// 3. Hello World를 출력하는 메소드
	public static void printHello() { // void : 리턴타입이 없음을 의미하는 키워드(아직은 리턴타입을 모르겠을때 임의로 사용도가능)
		System.out.println("Hello World!!!");
	}

}
