package 쓰레드활용;

// 여러개의 스킬을 동시에 수행 -> 멀티쓰레딩
// 1. Thread 클래스 확장(상속)
public class Ari extends Thread {

	private String skill;

	// 생성자 : 특정 키 스킬을 수행하는 아리 캐릭터 생성
	public Ari(String skill) {
		this.skill = skill;
	}

	// Thread 클래스 => run 메서드 오버라이딩 ★★★필수
	// run 메서드 => 실제 실행할 기능 정의, 하나의 쓰레드가 수행할 작업 정의
	public void run() {
		System.out.println("입력키 : " + skill);
		// 한 스킬당 3초동안 사용
		for (int i = 1; i <= 3; i++) {
			System.out.println(skill + "사용중 : " + i + "s");
		}

		System.out.println(skill + "스킬 사용 종료");
	}

}
