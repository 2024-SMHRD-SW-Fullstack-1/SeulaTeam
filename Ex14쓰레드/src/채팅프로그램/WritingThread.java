package 채팅프로그램;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 클라이언트가 작성한 채팅내용을 서버로 보내주는 작업
public class WritingThread extends Thread {

	Socket socket = null;
	Scanner sc = new Scanner(System.in);

	// 채팅을 받아야하는 서버 소켓 정보
	public WritingThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		// 클라이언트 -> 서버(OutputStream)
		OutputStream output;
		try {
			output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);

			// 키보드로 입력한 값을 보내기 (Scanner)
			while (true) {
				writer.println(sc.nextLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
