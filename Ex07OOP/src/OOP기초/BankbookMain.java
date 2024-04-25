package OOP기초;

public class BankbookMain {

	public static void main(String[] args) {
		// 1. Bankbook 설계도면을 기반으로 bank1 객체 생성
		// 자료형 변수명 = new 자료형();
		Bankbook bank1 = new Bankbook();
		// 2. bank1에 8000원 입금
		bank1.deposit(8000);
		// 3. bank1에 5000원 출금
		bank1.withdraw(10000);
		// 4. bank1에 잔액을 출력
		System.out.println(bank1.showMoney());

	}

}
