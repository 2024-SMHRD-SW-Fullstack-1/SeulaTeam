package arraylist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicPlayList2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	      ArrayList<String> musicList = new ArrayList<String>();
	      
	      while(true) {
	         System.out.print("[1]노래추가 [2]노래삭제 [3]종료 >> ");
	         
	         int menu = sc.nextInt();
	         
	         if(menu==1) { //노래 추가
	            
	            printPlayList(musicList);
	            
	            System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
	            int input = sc.nextInt();
	            if(input ==1) {
	               System.out.print("추가 할 노래 입력 >> ");
	              // String inputTitle = sc.next();
	              // musicList.add(inputTitle);
	               musicList.add(sc.next());
	            }else {
	               System.out.print("추가 할 노래 입력 >> ");
	                String inputTitle = sc.next();
	                System.out.print("추가 할 위치 입력 >> ");
	               int inputIndex = sc.nextInt();
	               try { //실행하고 싶은 코드 작성
	                  musicList.add(inputIndex-1, inputTitle);
	               }catch(IndexOutOfBoundsException e) {
	                  //개발단계
	                  //e.printStackTrace(); //예외상황에 대해서 출력
	                  System.out.println("지정할 수 없는 인덱스 입니다!");
	               }
	            }
	            
	            //예외처리
	            //오류(1. 컴파일오류 / 2. 런타임오류)
	            //1. 컴파일오류 : 컴파일 자체가 안되는 오류(오타, 자료형 잘못작성 ... ) => 빨간줄 => 실행x
	            //2. 런타임(실행)오류 : 컴파일까지는 문제가 없음(코드에는 문제가 x)
	            //   ex. 배열/arraylist 의 인덱스번호를 잘못 지정했을 때 => Exception 발생(예외상황 발생)
	            //   => 예외처리 필수!
	            //   (try~catch / throws)
	            

	         }else if(menu==2) { //노래 삭제
	            printPlayList(musicList);
	           
	            //곡이 없다면 삭제할 곡이 없습니다 출력 -> 현재 if문 종료
	            // 하나라도 있다면 삭제 기능 진행
	            if(musicList.isEmpty()) {
	               System.out.println("삭제할 곡이 없습니다.");
	            }else {
	               System.out.println("[1]선택삭제 [2]전체 삭제 >> ");
	               int input = sc.nextInt();
	               
	               if(input==1) {
	                  
	                  try { //실행하고 싶은 코드
	                     System.out.print("삭제할 노래 선택 >> ");
	                      int inputIndex = sc.nextInt();
	                     musicList.remove(inputIndex-1); 
	                  }catch(IndexOutOfBoundsException e) { //try 블럭에서 오류가 발생한 경우에는 실행되는 블럭
	                     //개발중
	                     //e.printStackTrace();
	                     System.out.println("지정할 수 없는 인덱스 입니다.");
	                  }catch(InputMismatchException e) {
	                     System.out.println("숫자로 입력해주세요");
	                  }
	                  
	                  System.out.println("노래가 삭제되었습니다");
	               }else {//2
	                  musicList.clear();
	                  System.out.println("전체 list가 삭제되었습니다");
	               }
	            }
	            
	         }else {
	            System.out.println("프로그램 종료");
	            break;
	         }
	      }

	   }

	   //재생목록 출력
	   public static void printPlayList(ArrayList<String> musicList) {
	         System.out.println("======현재 재생 목록======");
	         //if(musicList.size()==0) {
	         if(musicList.isEmpty()) {
	            System.out.println("재생목록이 없습니다");
	         }else {
	            int index = 1;
	            for(String s:musicList) {
	               System.out.println(index+". "+s);
	               index++;
	            }
	         }
	         System.out.println("=======================");


	}

}
