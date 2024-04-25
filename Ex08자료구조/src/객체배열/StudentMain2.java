package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 2명의 학생 데이터를 저장할 배열 : 각 정보는 직접 입력 받기
		ArrayList<Student> al = new ArrayList<Student>();
		for (int i = 0; i < 2; i++) {
			// 첫번째 학생(0번 인덱스)의 데이터
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("반 >> ");
			int ban = sc.nextInt();
			System.out.print("번호 >> ");
			int num = sc.nextInt();

			al.add(new Student(name, ban, num));
		}

		// 배열에 저장된 값 확인
		for (int j = 0; j < al.size(); j++) {
			System.out.println(al.get(j).getName() + "," + al.get(j).getBan() + "반," + al.get(j).getNum() + "반");
		}

	}

}
