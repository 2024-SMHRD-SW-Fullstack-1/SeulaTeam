package 상속기초;

public class Main {

	public static void main(String[] args) {
		
		/* 상속 : 기존 클래스의 변수(Data)와 메소드(로직,코드)를 물려받아 새로운 클래스를 구성하는 것
		 * 
		 * 상속의 장점
		 * 1. 기존 클래스의 변수와 코드를 재사용   --> 코드의 중복 감소 클래스 간결화
		 * 2. 먼저 작성된 검증된 프로그램을 재사용 --> 신뢰성있는 프로그램 손쉽게 개발
		 * 3. 클래스간 계층적 분류 및 관리	--> 유지보수 용이
		 * 
		 * class 서브클래스 extends 슈퍼클래스
		 * 
		 * 상속의 특징
		 * 1. 다중상속을 지원하지 않는다.
		 * 2. 상속의 횟수에 제한을 두지 않는다.
		 * 3. 모든 클래스는 java.lang.Object를 상속받는다.	---->Object == 클래스 공통의 조상
		 * 
		 */
		
		
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		// 2. Child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makejae();
		c.makejae();
		
		c.makekimchi();
		
		
		// 메소드 오버라이딩(method overriding)
		// 1. 상속이 전제되어 있어야 한다.
		// 2. 부모클래스가 가지고 있는 메소드의 틀(리턴타입, 메소드 명, 매개변수)을 그대로 가지고 와서 {} 안쪽의 로직만 ★★★재정의★★★
		// 하는 기법

		// 오버라이딩 - 재정의
		// 오버로딩 - 중복정의

		// 객체의 형변환(casting)
		// Reference Type에서의 형변환은 반드시 상소속이 전제되어 있어야 한다.
		// ----> 객체 내 필드, 메소드의 접근권한을 기준으로 강제 vs 자동

		// 1) UpCasting(업캐스팅)
		// : 자식(서브, 하위)클래스가 부모(슈퍼, 상위) 클래스 타입으로 자동으로 형변환 하는 것
		// ex) 강아지는 동물이다 --> 말 안됨!
		//	   모든 동물은 강아지다 ---> 말 안됨!
		Parent p2 = new Child();
		p2.makekimchi();
		// 만약에, 자식클래스가 부모클래스의 메소드를 재정의(오버라이딩)한 경우 업캐스팅 된 객체는 자식클래스의 메소드를 호출
		
		
		// 2) DownCasting(다운캐스팅)
		// : 부모 클래스가 자식 클래스로 강제 형변환
//		Child c2 = (Child) new Parent();
		// Exception 발생!
		// : 구문 오류는 없으나 실행했을 때 예외상황이 발생하는 것!
		
		// DownCasting(다운캐스팅)
		// : 업캐스팅된 객체를 강제형변환으로 본래의 자료형태로 되돌려놓는 것
		// 전제조건 : 업캐스팅 된 객체만 다운캐스팅 가능하다!
		Child c2 = (Child) p2;
		c2.makekimchi();
		// ---> 본래 자신이 가지고 있던 메소드를 사용할 수 있음!
		
		
		
		
		
		
	}

}
