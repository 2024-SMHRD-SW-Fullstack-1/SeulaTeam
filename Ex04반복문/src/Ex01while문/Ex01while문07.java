package Ex01while문;

import java.util.Scanner;

public class Ex01while문07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int count =0;

		while(count<3) {
				count+=1;
				System.out.print("아이디 : ");
				String id = sc.next();
			
				System.out.print("비밀번호 : ");
				int pw = sc.nextInt();
			
			if(id!="smhrd"||pw!= 1234) {
				System.out.println("로그인 실패");
			}else if(id=="smhrd"&&pw==1234){
				System.out.println("로그인 성공");
				break;
			}

		
		}
	}
}


