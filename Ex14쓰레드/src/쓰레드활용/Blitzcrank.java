package 쓰레드활용;

// 동시에 여러 스킬을 사용할 수 없음
// 현재 스킬이 완료되기 전까지는 다른 스킬(작업)을 사용할 수 없음 => 단일 쓰레딩
public class Blitzcrank {

	private String skill;

	// 생성자 : 특정 키 스킬을 수행하는 블리츠 캐릭터 생성
	public Blitzcrank(String skill) {
		this.skill = skill;
	}

	public void run() {
		System.out.println("입력키 : " + skill);
		// 한 스킬당 3초동안 사용
		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "사용중 : " + i + "s");
		}

		System.out.println(skill + "스킬 사용 종료");
	}

}
