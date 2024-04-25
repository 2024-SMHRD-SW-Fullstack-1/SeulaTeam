package Stack;

import java.util.Stack;

public class Ex01Stack활용 {

	public static void main(String[] args) {

		Stack<String> Stack = new Stack<String>();

		// 데이터 추가(push)
		Stack.push("A");
		Stack.push("B");
		Stack.push("C");

		// 가장 마지막 요소(제일 위에 있는 데이터) 확인
		String peekData = Stack.peek();
		System.out.println(peekData);

		// 특정 데이터의 위치 확인
		int a = Stack.search("A");
		System.out.println(a);
		
		//제일 마지막 요소 (제일 위에 있는 데이터) 삭제
		String popData = Stack.pop();
		System.err.println(popData);
		
		System.out.println(Stack.empty());
	}

}

/* 아 존나졸리다 진짜 개피곤해 잠아 ㅗㅑㄴ
 * ABDEGHCFI
 * DBGEHACIF
 * DGHEBIFCA
 * ABCDEFGHI
 * 
 * 차수 2 단말 노드 4
 * +** /ABCDE
 * ABDCEGHF
 * 3
 * DBAECF*/

