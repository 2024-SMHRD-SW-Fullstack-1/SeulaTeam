package 학생정보관리프로그램;

public class Student {
	
	// getter, setter 자동완성 단축키
	// alt + shift + s ---> Generate Getters and Setters 옵션
	// 화면에서 마우스 우클릭 ---> Source ---> Generate Getters and Setters 옵션
	
	// 1. Field
	private String name; // 이름
	private int number; // 학번
	private int age; // 나이
	private int javascore; // 자바점수
	private int webscore; // 웹 점수
	private int androidscore; // 안드로이드 점수

	
	// 생성자(Constructor)
	// 객체를 생성하는 순간에 실행되는 메소드
	// 필드에 있는 데이터를 객체를 생성하는 순간에 초기화(초기값)를 시켜줄 수 있도록 로직 작성
	public Student(String name, int number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	// 생성자의 특징
	// 1) 리턴타입을 지정조차 하지 않는다. (void도 작성 안함)
	// 2) 생성자의 이름은 클래스 이름과 동일해야 한다. (대소문자까지)
	// 3) 생성자도 결국 메소드이다.
	// 4) 매개변수가 아무것도 없는 생성자를 기본 생성자(default constructor)라고 부르는데 생략 가능하다.
	// 단, 새로운 나만의 생성자를 만들게 되면 기본 생성자는 덮어씌워진다(사라진다)
	// 5) 생성자도 오버로딩(중복정의) 가능하다.
	// 오버로딩이란
	// ---> 메소드의 이름과 리턴타입이 동일한 상태에서 매개변수의 개수와 타입을 다르게 *중복의로 정의*하는 메소드의 정의 기법

	public Student() {
		
	}


	// getter 메소드
	// ---> 클래스 내부에 있는 필드 값을
	// 외부(다른 클래스)에서 가져갈 수 있는 메소드
	public String getName() {
		return name;
	}

	// setter 메소드
	// ---> 클래스 내부에 있는 필드 값을
	// 외부(다른 클래스)에서 수정할 수 있도록 하는 메소드
	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJavascore() {
		return javascore;
	}

	public void setJavascore(int javascore) {
		this.javascore = javascore;
	}

	public int getWebscore() {
		return webscore;
	}

	public void setWebscore(int webscore) {
		this.webscore = webscore;
	}

	public int getAndroidscore() {
		return androidscore;
	}

	public void setAndroidscore(int androidscore) {
		this.androidscore = androidscore;
	}

	

	// 2. Method

}
