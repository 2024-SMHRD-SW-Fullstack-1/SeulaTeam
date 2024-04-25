package 계산게임;

import java.util.Random;

public class PlusGame implements IGame {

	Random rd = new Random();
	int num1;
	int num2;

	@Override
	public void makeRandom() {
		num1 = rd.nextInt(10) + 1;
		num2 = rd.nextInt(10) + 1;
	}

	@Override
	public String getQuizMsg() {
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		if (answer == num1 + num2) {
			return true;
		} else {
			return false;
		}
	}

}
