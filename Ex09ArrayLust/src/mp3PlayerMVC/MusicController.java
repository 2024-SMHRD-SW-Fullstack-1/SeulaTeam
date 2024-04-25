package mp3PlayerMVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {
	// Controller : 기능들을 가지고 있는 도구
	// 노래를 재생 기능!!
	// 1) 필드
	private MP3Player mp3 = new MP3Player();
	private ArrayList<Music> musicList = new ArrayList<Music>();
	private int i = 0; // 몇번째 곡인지 기억하고 있는 변수

	// 2) 메소드

	// 기본 생성자
	public MusicController() { // musicList에 하나하나 넣어주기
		String comPath = "C:\\Users\\smhrd\\OneDrive\\바탕 화면\\java\\Ex09ArrayLust\\player\\";
		musicList.add(new Music(comPath + "밤양갱.mp3", "비비", "밤양갱"));
		musicList.add(new Music(comPath + "Magnetic.mp3", "아일릿", "Magnetic"));
		musicList.add(new Music(comPath + "Smart.mp3", "르세라핌", "Smart"));
		musicList.add(new Music(comPath + "첫만남은계획대로되지않아.mp3", "투어스", "첫만남은계획대로되지않아"));
		musicList.add(new Music(comPath + "한페이지가될수있게.mp3", "데이식스", "한페이지가될수있게"));
	}

	// 재생하는 메소드
	public Music play() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicList.get(i).getPath());
		return musicList.get(i);
	}

	// 정지하는 메소드
	public boolean stop() {
		boolean result = false;
		if (mp3.isPlaying()) {
			mp3.stop();
			result = true; // 노래를 잘 멈췄다면 true로 바꿔주기
		}
		return result;
	}

	// 이전곡 메소드
	public Music prev() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		i--;
		if (i >= 0) {
			mp3.play(musicList.get(i).getPath());
			return musicList.get(i);
		} else {
			i = 0;
			return null;
		}
	}

	// 다음곡 메소드
	public Music next() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}

		i++;
		if (i < musicList.size()) {
			mp3.play(musicList.get(i).getPath());
			return musicList.get(i);
		} else {
			i = musicList.size() - 1;
			return null;
		}
	}


}
