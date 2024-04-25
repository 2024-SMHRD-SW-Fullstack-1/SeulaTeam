package 객체배열;

public class pokemon {
	// 하나의 포켓몬에 대한 설계도 : 속성(필드) / 기능(메서드)
	// => 모든 포켓몬이 공통적으로 가져야하는 필드 / 메서드 정의
	// 1. 필드
	// 이름, 타입, 스킬, hp, atk private로 잠금
	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;

	public pokemon(String name, String type, String skill, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}

	public pokemon() {

	}

	// 2. 메소드
	// 단축키 ---> alt + shift + s
	// getter, setter ---> 필드 전부 다!
	// 생성자 새롭게 만들기!!
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
