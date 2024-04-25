package Ex02For문;

public class Ex02For문02 {

	public static void main(String[] args) {
		
		//if : 조건을 전부다 확인(조건식이 1~3개 일때는 if문이 좀더 효율)
		//switch : jump(조건이 4개 이상일때는 switch가 좀더 효율)
		
		for (int i = 1; i <= 50; i++) {

			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.println("박수");
			} else if (i % 10 == 5) {
				System.out.println("으악");
			} else {
				System.out.println(i);
			}
		}

	}

}
