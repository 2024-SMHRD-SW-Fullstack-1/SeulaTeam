package 객체배열;

import java.util.ArrayList;

public class pokemonmain {

	public static void main(String[] args) {

		pokemon pikachu = new pokemon();

		pikachu.setName("피카추");
		pikachu.setType("전기");
		pikachu.setSkill("백만볼트");
		pikachu.setHp(100);
		pikachu.setAtk(20);

		pokemon paili = new pokemon("파이리", "불", "불공격", 80, 30);

		// 배열 / ArrayList
		// 1. 배열(고정길이)에 포켓몬 저장
		pokemon[] ball = new pokemon[2];
		// 2.
		ball[0] = pikachu;
		ball[1] = paili;

		// 3. 각 인덱스에 저장되어 있는 pokemon 객체에 접근
		System.out.println(ball[0].getType());
		System.out.println(ball[1].getName());

		// 4. 배열에 저장되어있는 포켓몬들의 정보를 모두 출력
		for (int i = 0; i < ball.length; i++) {
			System.out.println(ball[i].getName());
			System.out.println(ball[i].getType());
		}

		for (pokemon p : ball) {
			System.out.println(p.getName());
		}

		// ArrayList(가변길이)
		// 1. ArrayList 생성
		ArrayList<pokemon> ball2 = new ArrayList<pokemon>();

		// 2. 포켓몬 추가
		// pokemon kkobuk = new pokemon("꼬북이", "물", "물대포", 50, 10);
		// ball2.add(kkobuk);

		ball2.add(new pokemon("꼬북이", "물", "물대포", 50, 10));

		// 3. 0번 인덱스의 값에 접근
		String name = ball2.get(0).getName();
		System.out.println(name);

		for (int i = 0; i < ball2.size(); i++) {
			System.out.println(ball2.get(i).getHp());
		}

		for (pokemon p : ball2) {
			System.out.println(p.getSkill());
		}

	}

}
