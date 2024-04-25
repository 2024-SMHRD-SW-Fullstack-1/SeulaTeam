package 계산게임;

public interface IGame {

	// 1. 랜덤한 두 수를 생성하는 기능
	public abstract void makeRandom();

	// 2. makeRandom에서 생성된 두 수를 "num1 + num2 = "로 반환하는 기능
	public abstract String getQuizMsg();

	// 3. 랜덤한 두 수를 더한 결과값과 사용자가 입력한 결과값이 같은지 판단해서 true/false 결과값으로 반환
	public abstract boolean checkAnswer(int answer);

}
