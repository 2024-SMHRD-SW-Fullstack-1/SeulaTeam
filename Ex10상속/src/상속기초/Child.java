package 상속기초;

public class Child extends Parent {

	// 새로운 클래스, 자식 클래스, 서브클래스
	// 한식당 2호점
	// extends --> 연장하다 확장하다 의미!
	// : class를 선언하는 구간에 적는다!

	// 1. 계란찜 메뉴를 담는다.
	public void makeJjim() {
		System.out.println("맛있는 계란찜을 만든다~~~");
	}

	// 2. 부모님 가게의 김치찌개 메뉴를 변경
	// annotation(주석) --> 특정 기능을 가지고 있는 것 X
	// ---> 자동완성된 메소드 위에 마우스를 올렸을 때 포스트잇 모양에 표시해주는 역할!
	@Override
	public void makekimchi() {
		System.out.println("맛있는 김치찌개를 끓인다~~~ 보글보글");
	}

}
