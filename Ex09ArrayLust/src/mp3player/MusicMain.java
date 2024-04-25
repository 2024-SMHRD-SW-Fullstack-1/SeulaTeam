package mp3player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		// 1. 노래 재생시키는 도구 생성하기
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);

		// 2. 노래 데이터를 전부 저장하는 musicList 생성하기
		ArrayList<Music> musicList = new ArrayList<Music>();

		// 밤양갱.mp3 --> 경로, 가수 : 비비, 노래재목 : 밤양갱
		String comPath = "C:\\Users\\smhrd\\OneDrive\\바탕 화면\\java\\Ex09ArrayLust\\player\\";
		// Music m1 = new Music(comPath + "밤양갱.mp3", "비비", "밤양갱");

		musicList.add(new Music(comPath + "밤양갱.mp3", "비비", "밤양갱"));
		musicList.add(new Music(comPath + "Magnetic.mp3", "아일릿", "Magnetic"));
		musicList.add(new Music(comPath + "Smart.mp3", "르세라핌", "Smart"));
		musicList.add(new Music(comPath + "첫만남은계획대로되지않아.mp3", "투어스", "첫만남은계획대로되지않아"));
		musicList.add(new Music(comPath + "한페이지가될수있게.mp3", "데이식스", "한페이지가될수있게"));

		int i = 0; // 몇번째 곡인지 기억하고 있는 변수
		System.out.println("====== MP3 플레이어 ======");
		while (true) {
			System.out.print("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("====== 재생 ======");
				// 1. 노래가 재생중인지 여부를 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이면 노래 멈추기
					mp3.stop();
				}
				// 3. 뮤직 플레이리스트 0번방에 있는 노래를 재생
				// 노래를 재생하기 위해서 필요한 데이터는? --> 노래의 주소

				// musicList의 0번방에 접근해서 주소 가져오기
				mp3.play(musicList.get(i).getPath());

				// 4. 가수 - 노래 제목 이 재생중입니다.
				System.out.println(musicList.get(i).getArtist() + " - " + musicList.get(i).getTitle());

			} else if (input == 2) {
				System.out.println("====== 정지 ======");
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 멈추고 "노래 재생을 정지합니다" 출력!
					mp3.stop();
					System.out.println("노래 재생을 정지합니다.");
				} else {
					// 3. 재생중이 아니라면 재생중인 노래가 없습니다.
					System.out.println("재생중인 노래가 없습니다.");
				}

			} else if (input == 3) {
				System.out.println("====== 이전곡 ======");
				// 1. 노래 재생중인지 여부를 판단
				// 2. 재생중이라면 노래를 정지
				// 3. 뮤직 플레이리스트(우리가 만든 ArrayList)의 이전곡 재생
				// ex) i = 2 ----> 1 / 3 ----> 2
				// 5. 단, 이전 곡이 없다면 이전곡이 없습니다. 출력
				// ---> 다시 재생을 선택한다면 뮤직 플레이리스트의 첫번째 곡이 재생되게 만들기
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				i--;
				if (i >= 0) {
					mp3.play(musicList.get(i).getPath());
					// 4. 가수 - 노래 제목 이 재생중입니다.
					System.out.println(musicList.get(i).getArtist() + " - " + musicList.get(i).getTitle());
				} else {
					System.out.println("이전곡이 없습니다.");
					i = 0;
				}

			} else if (input == 4) {
				System.out.println("====== 다음곡 ======");
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				// 3. 뮤직 플레이리스트(우리가 만든 ArrayList)의 다음곡 재생
				// 0 ---> 1 / 1 ---> 2
				i++;
				if (i < musicList.size()) {
					mp3.play(musicList.get(i).getPath());
					// 4. 가수 - 노래 제목 이 재생중입니다.
					System.out.println(musicList.get(i).getArtist() + " - " + musicList.get(i).getTitle());
				} else {
					// 5. 단, 다음곡이 없다면 "다음곡이 없습니다"를 출력
					// -----> 다시 재생을 선택하면 뮤직플레이리스트의 마지막 곡이 재생되게 만들기
					// 우리 노래는 5곡만 있다는거 기억하기
					System.out.println("다음곡이 없습니다.");
					i = musicList.size() - 1;
				}

			} else if (input == 5) {
				System.out.println("====== 종료 ======");
				// 노래를 멈춰주기
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break; // 반복문만 종료 노래는 계속 재생중

			} else {
				System.out.println("숫자를 다시 입력해 주세요.");
			}
		}
	}

}
