package arraylist;

import java.util.ArrayList;

public class Ex01ArrayList활용 {

	public static void main(String[] args) {
		
		// 1. ArrayList(java.util) 생성
		// ArrayList객체 생성 생성자(메서드) 호출
		// **자바는 타입(자료형)을 엄격하게 확인**
		// <> : Generic => ArrayList 내부가 아닌 외부에서
		//		자료의 형태를 결정!
		// INT용 ArrayList, String 용 ArrayList....
		// <> : 타입(자료형) 지정 시 무조건 레퍼런스 형태만 지정 가능
		//		=> 기본 자료형은 지정X
		// int -> Integer, char -> Character
		
		// 크기가 10(기본값)인 공간을 할당 **길이x, 데이터 개수o
		ArrayList<Integer> al = new ArrayList<Integer>(20);		//() -> 있으면 메서드 없으면 변수
		
		//2. 데이터 추가(맨 뒤에 추가)		
		al.add(1);
		al.add(2);
		al.add(3);
		// ***arraylist 중간에 빈공간(null도 아니라 아무값도 없는것)을 넣을수 없다
		
		// 3. 현재 arraylist 안에 데이터 개수(리스트의 길이) 알아내기
		int size = al.size();
		System.out.println("데이터 개수 : " + size);
		
		// 4. 현재 arraylist 안에 있는 데이터 순차적으로 가져오기
		// 0번째에 저장된 데이터 가져오기
		Integer num1 = al.get(0);
		Integer num2 = al.get(1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(al.get(2));
		
		//for문 기본 구조
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//for문 변형형태 (for~each문) : 배열/ArrayList(순차적 데이터)를 다룰떄
		//0번 인덱스의 값부터 1,2,3,... 차례대로 꺼내올 수 있는 형태
		for(Integer i : al) {
			// i => arraylist/배열에 저장되어있는 실제 값
			System.out.println(i);
		}
		
		// 5. 특정 위치(인덱스)에 데이터 추가
		// 1(0), 2(1), 3(2)
		al.add(1,8);
		
		for(Integer i : al) {
			System.out.println(i);
		}
		// size보다 큰 인덱스는 지정할 수 없음!
		// al.add(5,10);
		
		// 6. (특정위치-인덱스)데이터 삭제
		// 2번 데이터 삭제
		al.remove(2);
		for(Integer i : al) {
			System.out.println(i);
		}
		
		// 7. 데이터 전부 삭제
		al.clear();
		System.out.println(al.size()	);
			
	}

}
