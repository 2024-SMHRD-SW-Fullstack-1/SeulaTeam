package 삼항연산;

public class Ex05치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		System.out.println("왼손 : "+left);		//red
		System.out.println("오른손 : "+right);	//blue
		
		//치환 코드 작성
		String temp = "";	//임시 저장 공간 =>초기화를 시켜주는게 좋음
						//left 	right 	temp
		temp = left;	//red 	blue	red
		left = right;	//blue	blue	red
		right = temp;	//blue	red		red
		
		System.out.println("왼손 : " + left);
		System.out.println("오른손 : " + right);
		System.out.println("temp " + temp);
		

	}

}
