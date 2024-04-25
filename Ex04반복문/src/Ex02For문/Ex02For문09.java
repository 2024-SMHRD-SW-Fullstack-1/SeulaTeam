package Ex02For문;

public class Ex02For문09 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int b = 0; b < i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

//////////////////////////////////////////

		for (int i = 1; i <= 5; i++) {

			for (int b = 6; b > i; b--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 6 - j; i++) {
				System.out.print("*"); // 별출력 1번 반복
			}
			System.out.println();
		}

//////////////////////////////////////////

		for (int i = 1; i <= 5; i++) {

			for (int b = 5; b > 0; b--) {

				if (i < b) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int j=1; j<=5;j++) {
	         //  j=1      i<=4
	         //  j=2      i<=3
	         //  j=3      i<=2
	         //  j=4      i<=1
	         //  j=5      i<=0
	         for(int i=1; i<=5-j; i++) {
	            System.out.print("#"); //별출력 1번 반복         
	         }
	         for(int i=1; i<=j; i++) {
	            System.out.print("*"); //별출력 1번 반복         
	         }
	         System.out.println();
	      }

//////////////////////////////////////////

		for (int i = 0; i < 5; i++) {
			for (int b = 1; b <= 5; b++) {
				if (i < b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//////////////////////////////////////////
	}

}
