package 배열;

public class Ex01배열05 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] str = score.split(",");

		int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0;

		for (int i = 0; i < str.length; i++) {
			switch (str[i]) {
			case "A":
				A++;
				break;
			case "B":
				B++;
				break;
			case "C":
				C++;
				break;
			case "D":
				D++;
				break;
			default:
				F++;
				break;
			}
		}
		System.out.println("A : "+ A);
		System.out.println("B : "+ B);
		System.out.println("C : "+ C);
		System.out.println("D : "+ D);
		System.out.println("F : "+ F);

	}
}
