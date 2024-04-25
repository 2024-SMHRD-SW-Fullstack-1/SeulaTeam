package 객체배열;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 2명의 학생 데이터를 저장할 배열 : 각 정보는 직접 입력 받기
		Student[] arr = new Student[2];
		for (int i = 0; i < arr.length; i++) {
			// 첫번째 학생(0번 인덱스)의 데이터
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("반 >> ");
			int ban = sc.nextInt();
			System.out.print("번호 >> ");
			int num = sc.nextInt();

			arr[i] = new Student(name, ban, num);
		}

		// 배열에 저장된 값 확인
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j].getName() + "," + arr[j].getBan() + "반," + arr[j].getNum() + "반");
		}

	}

}
