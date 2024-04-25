package 추상클래스;

public class TempEmployee extends Employee {

	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay); // => 부모클래스의 생성자를 호출하는 메소드
	}

	public int getMoneyPay() {
		return pay / 12;
	}

}
