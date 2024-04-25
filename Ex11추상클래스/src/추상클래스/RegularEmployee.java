package 추상클래스;

public class RegularEmployee extends Employee {

	private int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay); // => 부모클래스의 생성자를 호출하는 메소드
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

}
