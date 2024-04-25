package OOP기초;

public class Bankbook {

	// 은행 프로그램을 만든다고 가정!
	// 통장 정보를 저장할 수 있는 우리만의 자료형 설계도면

	// 1. Field(Data, 속성)
	// 잔액(money)
	private int money;
	// 이름(name)
	private String name;
	// 클래스 내부에 존재하는 데이터는 외부에서 함부로 접근할 수 없게끔
	// 정보은닉을 지켜주어야 한다!(사용자가 임의로 변경하는 것을 막기!)

	// 2. Method(Logic, 기능, 행위)
	// 1) 입금하다(deposit)
	// ---> return type 없음, 매개변수로 정수형 데이터 한개 받아오기
	// 로직은 매개변수로 받아온 데이터를 현재 잔액에 누적시켜주기!
	public void deposit(int money) {
		this.money += money;
		// this 키워드
		// this.money ---> this가 가지고 있는 money
		// == Bankbook.money
		// 현재 Class 그 자체(나 자신)를 지칭하는 키워드
	}

	// 2) 출금하다(withdraw)
	// ---> return type 없음, 매개변수로 정수형 데이터 한개 받아오기
	// 로직은 매개변수로 받아온 데이터를 현재 잔액에서 빼주기
	public void withdraw(int money) {
		if (this.money > money) {
			this.money -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	// 3) 잔액확인하기(showMoney)
	// ---> return type 있음! int 형태를 되돌려주기
	// 매개변수는 없음. 현재 작앤을 리턴
	public int showMoney() {
		return money;
	}

}
