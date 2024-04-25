package 닌텐도게임;

public class GameMain {

	// 닌텐도 게임기(실행할수 있는 공간)
	public static void main(String[] args) {

		Dongmul d = new Dongmul();
		on(d);
		// 포켓몬 게임칩 꺼내오기
		Pokemon p = new Pokemon();
		// 게임칩 넣기
		on(p);
		// 마리오 게임칩 꺼내오기
		Mario m = new Mario();
		// 게임칩 넣기
		on(m);
		// 젤다 게임칩 꺼내오기
		zelda z = new zelda();
		// 게임칩 넣기
		on(z);
	}

	// 게임칩을 넣어서 작동시키는 메소드
	private static void on(GameChip g) {
		g.gameStart();
	}
	/*
	// 메소드 오버로딩법으로 풀어내는 방법
	private static void on(Mario m) {
		m.gameStart();
	}
	
	private static void on(zelda z) {
		z.gameStart();
	}
	*/
}
