package 객체배열;

import java.util.Scanner;

public class StdScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StdScore[] arr = new StdScore[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			System.out.print(i + 1 + "번째 학생의 Java점수를 입력하세요. >> ");
			int JavaScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Web점수를 입력하세요. >> ");
			int WebScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Android점수를 입력하세요. >> ");
			int AndroidScore = sc.nextInt();
			System.out.println();
			
			arr[i] = new StdScore(name, JavaScore, WebScore, AndroidScore);
		}

		for (int j = 0; j < arr.length; j++) {
			int total = arr[j].getScoreAndroid() + arr[j].getScoreJava() + arr[j].getScoreWeb();
			System.out.println(arr[j].getName() + "의 총점은 " + total + "점, 평균은 " + (total/3) + "점 입니다.");
		}

	}

}
