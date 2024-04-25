package 풀이;

import java.util.Arrays;

public class Ex13번 {

	public static void main(String[] args) {

		String str = "A,A,B,C,D,A,C,D,D,D,F";
		String[] array = str.split(",");

		String[] score = { "A", "B", "C", "D", "F" };

		int[] count = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (array[i].equals(score[j])) {
					count[j]++;
				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " : " + count[i] + "명");
		}

	}

}
