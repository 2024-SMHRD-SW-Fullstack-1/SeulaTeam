package 삼항연산;

public class Ex04비트시프트연산 {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 6;
		
		//비트연산자 : &(AND), |(OR), ~(NOT), ^(XOR)
		//XOR : 두 비트가 같을때(0), 다를때는(1)
		
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(num1^num2);
		System.out.println(~num1);
		
		//시프트연산자 : <<(비트를 왼쪽으로 이동) >>(비트를 오른쪽으로 이동)
		System.out.println(num1<<1);
		System.out.println(num1>>1);
		
		//num1 = 0.1.0.0> ~num1 = 1.0.1.1(-8.0.2.1) = -5
		
	}

}
