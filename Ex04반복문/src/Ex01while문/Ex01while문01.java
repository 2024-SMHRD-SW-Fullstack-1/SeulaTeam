package Ex01while문;

public class Ex01while문01 {

	public static void main(String[] args) {
		
		//1~10 출력
		
		int i=0;
		// 반복할 조건 => 결과는 true/false
		while(i<=9) {
			i=i+1; //9
			System.out.println(i); //10
		}
		
		
		///////////////////////
		int j=0;
		// 반복을 멈출 조건
		while(true) { //무한반복문
			j=j+1;
			System.out.println(j);
			
			//j가 10이 되었다면 반복문을 나가겠다(break)
			if(j==10) {
				break;
			}
		}
		
		int k=1;
		
		do {
			k=k+1;
			System.out.println(k);
		}while(k<=9);
		
		
		
		
	}

}
