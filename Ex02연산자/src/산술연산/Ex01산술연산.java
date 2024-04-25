package 산술연산;

public class Ex01산술연산 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 7;
		float num3 = 10;
		float num4 = 7;
		
		System.out.println(num1/num2);	//정수/정수 => 정수
		System.out.println(num1%num2);	//정수%정수 => 정수
		System.out.println(num1/num4);	//정수/실수 => 실수
		System.out.println(num3%num4);	//실수/실수 => 실수
		
		System.out.println(num1+num2);	//정수+정수 => 정수연산결과
		
		String num5 = "10";
		String num6 = "7";
		System.out.println(num5+num6);
		
		String num7 = "10";
		int num8 = 7;
		//String + int => int이 String으로 자동변환
		System.out.println(num7+num8);
		
		
	}

}
