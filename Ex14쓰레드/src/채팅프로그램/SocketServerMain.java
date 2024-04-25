package 채팅프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

	public static void main(String[] args) {

		// 채팅 서버 포트 설정
		int serverPort = 1234;

		try {
			ServerSocket serverSocket = new ServerSocket(serverPort);
			
			// 서버 종료시까지 클라이언트가 접속하는 경우에는
			// 접속한 클라이언트의 정보를 저장(SocketServer list에 저장)
			while(true) {
				// 서버로 들어오는 클라이언트 받기
				Socket socketUser = serverSocket.accept();
				SocketServer socketServer = new SocketServer(socketUser);
				socketServer.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
