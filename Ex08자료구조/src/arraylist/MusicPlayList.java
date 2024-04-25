package arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicPlayList {

	public static void main(String[] args) {

		// 오류(1. 컴파일오류 / 2.런타임오류)
		// 1. 컴파일오류 : 컴파일 자체가 안되는 오류(오타, 자료형 잘못작성...) => 빨간줄 => 실행x
		// 2. 런타임(실햄)오류 : 컴파일까지는 문제가 없음(코드에는 문제가x)
		// ex. 배열/arraylist 의 인덱스번호를 잘못 지정했을 때 => Exception 발생(예외상황 발생)
		// => 예외처리 필수!!
		// (try~catch / throws)

		Scanner sc = new Scanner(System.in);
		ArrayList<String> List = new ArrayList<String>();

		while (true) {
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			int input = sc.nextInt();
			if (input != 3) {
				System.out.println("========== 현재 재생 목록 ==========");
				if (List.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					for (int i = 0; i < List.size(); i++) {
						System.out.println(i + 1 + "." + List.get(i));
					}
				}
			} else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			System.out.println("================================");
			if (input == 1) {
				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >>");
				input = sc.nextInt();
				if (input == 1) {
					System.out.print("추가 할 노래 입력 : ");
					String sing = sc.next();
					List.add(sing);
					System.out.println("추가가 완료되었습니다.");
				} else {
					System.out.print("추가 할 노래 입력 : ");
					String sing = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					input = sc.nextInt();
					List.add(input - 1, sing);
				}
			}

			else if (input == 2) {
				System.out.print("[1]선택삭제 [2]전체삭제 >> ");
				input = sc.nextInt();
				if (input == 1) {
					try {
						System.out.print("삭제할 노래 선택 >> ");
						input = sc.nextInt();
						List.remove(input - 1);
						System.out.println("노래가 삭제되었습니다.");
					} catch (IndexOutOfBoundsException e) {
						// 개발중
						// e.printStackTrace();
						System.out.println("지정할 수 없는 인덱스 입니다.");
					} catch (InputMismatchException e) {
						System.out.println("숫자로 입력해주세요");
					}
				} else {
					System.out.println("전체list가 삭제되었습니다.");
					List.clear();
				}
			}

		}

	}

}
