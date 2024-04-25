package mp3PlayerMVC;

public class Music {
	
	// 뮤직플레이어 안에서 사용할 우리만의 자료형
	
	// 1. 필드
	// 1) 노래 데이터의 위치(주소값, 경로)
	private String path;
	// 2) 가수 이름
	private String artist;
	// 3) 노래 재목
	private String title;
	
	// 2. 메소드

	public Music(String path, String artist, String title) {
		super();
		this.path = path;
		this.artist = artist;
		this.title = title;
	}
	
	public String getPath() {
		return path;
	}
	public String getArtist() {
		return artist;
	}
	public String getTitle() {
		return title;
	}
	
	
	
	
	
}
