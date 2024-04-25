package 쓰레드활용;

import java.awt.Toolkit;

public class ThreadSleepMain {

	public static void main(String[] args) {

		// 3초마다 삐~소리가 나게 하기 => 10번
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 1; i <= 10; i++) {
			toolkit.beep();
			System.out.println("3초 후에 beep음 울림!");

			try {
				Thread.sleep(3000); // ms 1000ms => 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
