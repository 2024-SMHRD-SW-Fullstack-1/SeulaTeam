package 변수;

public class Ex02자료형 {

	public static void main(String[] args) {
		
		//기본 자료형
		//1. 논리형 (true/ false)
		boolean sw = true;
		sw = false;
		
		//2. 문자형 : 문자 하나만 저장
		char C = 'A'+1;
		//
		char c1 = 65;
		System.out.print((char)(c1+1));  // ctrl + f11
		
		//3. 정수형
		byte num1 = 10;		//1byte
		short num2 = 20;	//2byte
		int num3 = 30;		//4byte
		long num4 = 40;		//8byte
		
		//4. 실수형
		float num5 = (float)3.14;	//강제 형변환
		float num6 = 3.14f;
		double num7 = 3.14;
		
		int num8 = (int)num7;		//3.14 -> 정수형
		System.out.print(num8);
		
		//참조형(reference)
		String s = "Hello World!";
		
		
		
	}

}
