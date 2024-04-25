package mp3player;

import javazoom.jl.player.MP3Player;

public class Ex01사용법 {

	public static void main(String[] args) {

		// jar -> 일종의 java project를 압축해놓은 확장자
		// 다른사람이 개발해놓은 class 파일들이 모아져 있는 상태
		// 일종의 라이브러리

		// jar 파일 추가하는 법
		// 프로젝트 선택 -> 마우스 우클릭 -> build path -> configure build path
		// -> libraries 탭으로 이동 -> class path 선택 -> 우측에있는 add jars 클릭
		// -> 원하는 jar 파일 추가 후 -> apply and close

		// 노래 재생 가능한 도구 생성

		MP3Player mp3 = new MP3Player();

		// 1. 재생하기
		mp3.play("C:\\Users\\smhrd\\OneDrive\\바탕 화면\\java\\Ex09ArrayLust\\player\\한페이지가될수있게.mp3");
		// 2. 노래 멈추기
		mp3.stop();
		mp3.play("C:\\Users\\smhrd\\OneDrive\\바탕 화면\\java\\Ex09ArrayLust\\player\\Smart.mp3");
		mp3.stop();
		
		// 재생여부 boolean 으로 확인
		System.out.println(mp3.isPlaying());
		
		
		/* MVC 패던 디자인패턴중 하나
		 * M(model) : 데이터 관리를 하기 위한 부분 ex) 노래 파일을 관리하기 위해서 Music 클래스 만듦
		 * V(view) : 실제로 사용자에세 보여지는 부분 ex) 콘솔창에 보이는 코드(출력문)
		 * C(controller) : 실제 기능에 관여하는 부분
		 * */
		
		
		
	}

}
