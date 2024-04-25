package 객체배열;

public class StdScore {
	
	private String name;
	private int JavaScore;
	private int Webscore;
	private int Androidscore;
	
	
	
	public StdScore(String name, int JavaScore, int Webscore, int Androidscore) {
		this.name = name;
		this.JavaScore = JavaScore;
		this.Webscore = Webscore;
		this.Androidscore = Androidscore;
	}
	public String getName() {
		return name;
	}
	public int getScoreJava() {
		return JavaScore;
	}
	public int getScoreWeb() {
		return Webscore;
	}
	public int getScoreAndroid() {
		return Androidscore;
	}
	
	
	
	
	
	
	
	
	
	
}
