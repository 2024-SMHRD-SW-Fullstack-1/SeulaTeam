package 객체배열;

public class Student {

	private String name;
	private int ban;
	private int num;

	public Student(String name, int ban, int num) {
		this.name = name;
		this.ban = ban;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getNum() {
		return num;
	}

	// getter, 생성자(이름, 반, 번호)

}
