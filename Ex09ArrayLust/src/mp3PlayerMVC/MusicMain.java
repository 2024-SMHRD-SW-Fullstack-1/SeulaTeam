package mp3PlayerMVC;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain { // View : 사용자 화면

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 노래 재생을 담당하는 Controller 생성하기
		MusicController con = new MusicController();

		System.out.println("====== MP3 플레이어 ======");

		while (true) {
			System.out.print("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.println("====== 재생 ======");
				Music m = con.play();
				System.out.println(m.getArtist() + " - " + m.getTitle());

			} else if (input == 2) {
				System.out.println("====== 정지 ======");
				if (con.stop() == true) {
					System.out.println("노래 재생을 정지합니다.");
				} else {
					System.out.println("재생중인 노래가 없습니다.");
				}

			} else if (input == 3) {
				System.out.println("====== 이전곡 ======");
				Music m = con.prev();
				if (m != null) {
					System.out.println(m.getArtist() + " - " + m.getTitle());
				} else {
					System.out.println("이전곡이 없습니다.");
				}

			} else if (input == 4) {
				System.out.println("====== 다음곡 ======");
				Music m = con.next();
				if (m != null) {
					System.out.println(m.getArtist() + " - " + m.getTitle());
				} else {
					System.out.println("다음곡이 없습니다.");
				}

			} else if (input == 5) {
				System.out.println("====== 종료 ======");
				con.stop();
				break;
			} else {
				System.out.println("숫자를 다시 입력해 주세요.");
			}
		}
	}

}
