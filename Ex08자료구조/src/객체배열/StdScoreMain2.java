package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class StdScoreMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<StdScore> al = new ArrayList<StdScore>();

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			System.out.print(i + 1 + "번째 학생의 Java점수를 입력하세요. >> ");
			int JavaScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Web점수를 입력하세요. >> ");
			int WebScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Android점수를 입력하세요. >> ");
			int AndroidScore = sc.nextInt();
			System.out.println();

			al.add(new StdScore(name, JavaScore, WebScore, AndroidScore));
		}
		//arr[i].getName(); => 배열
		//al.get(i).getName(); => ArrayList
		for (int j = 0; j < al.size(); j++) {
			int total = al.get(j).getScoreAndroid() + al.get(j).getScoreJava() + al.get(j).getScoreWeb();
			System.out.println(al.get(j).getName() + "의 총점은 " + total + "점, 평균은 " + (total / 3) + "점 입니다.");
		}

	}

}
