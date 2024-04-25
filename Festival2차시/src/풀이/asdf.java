package 풀이;

import java.util.Random;
import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] str = score.split(",");

		int[] arr = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("A")) {
				arr[0]++;
			} else if (str[i].equals("B")) {
				arr[1]++;
			} else if (str[i].equals("C")) {
				arr[2]++;
			} else if (str[i].equals("D")) {
				arr[3]++;
			} else if (str[i].equals("F")) {
				arr[4]++;
			}
		}
		System.out.println("A : " + arr[0]);
		System.out.println("B : " + arr[1]);
		System.out.println("C : " + arr[2]);
		System.out.println("D : " + arr[3]);
		System.out.println("F : " + arr[4]);
	}
}
