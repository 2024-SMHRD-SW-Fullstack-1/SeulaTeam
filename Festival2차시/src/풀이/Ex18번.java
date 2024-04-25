package 풀이;

import java.util.Arrays;
import java.util.Random;

public class Ex18번 {

	public static void main(String[] args) {

		Random rd = new Random();

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}

}
