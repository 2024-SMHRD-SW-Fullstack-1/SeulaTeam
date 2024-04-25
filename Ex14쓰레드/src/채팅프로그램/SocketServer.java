package 채팅프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

// 소켓서버
// 1. 연결 시도하는 클라이언트 받아주기
// 2. 클라이언트가 입력한 채팅 받아주기
// 3. 받은 채팅내용을 다른 클라이언트들 한테 보내주기
public class SocketServer extends Thread {

	// 현재까지 연결된 클라이언트들의 정보를 저장하는 리스트
	static ArrayList<Socket> socketList = new ArrayList<Socket>();
	Socket socket = null; // 현재 채팅을 보내는/받는 클라이언트의 정보 임시 저장공간

	// 현재 서버에 접속하려고 하는 클라이언트(Socket) 정보 받기!
	public SocketServer(Socket socket) {
		this.socket = socket;
		socketList.add(socket);

	}

	public void run() {
		// 클라이언트가 접속하면 해당 클라이언트의 네트워크상 주소(ip주소)를 출력
		System.out.println(socket.getInetAddress() + "님이 연결됨!");

		try {
			// 클라이언트가 보낸 메세지를 읽어들이는 스트림(통로) => inputstream
			InputStream input = socket.getInputStream();
			// 채팅내용을 임시적으로 보관할 버퍼 생성
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			// 서버가 클라이언트에게 메세지를 내보내는 스트림(통로) => outputstream
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);

			// 클라이언트가 최초로 입력한 값은 => 닉네임
			// 그 다음부터 입력하는 값음 => 채팅내용

			boolean check = false; // false : 사용자가 닉네임 입력하기 전 (아무것도 입력한적이 없는 상)
									// true : 사용자가 닉네임을 입력한 후 (true로 바꾼 이후부터는 채팅내용으로 받아들임)
			String nick = null; // 클라이언트가 입력한 닉네임 저장
			String readValue = null; // 클라이언트가 입력한 채팅 내용(처음 입력한 경우에는 닉네임 저장하고 있음)

			// 사용할 닉네임 입력받기
			writer.println("사용할 닉네임 >> ");

			// 클라이언트가 입력한 채팅내용(닉네임) 받기
			// 클라이언트가 입력한 내용이 있을 경우에 반복 수행
			while ((readValue = reader.readLine()) != null) {
				// 클라이언트가 처음 채팅을 입력했을 때에는 그 값을 닉네임을 저장
				// 그렇지 않은 경우에는 일반 채팅내용을 생각하고 다른 클라이언트들한테 보내줘야함!

				if (!check) { // 닉네임 저장
					nick = readValue; // 클라이언트가 작성한 내용 nick(닉네임) 변수에 저장
					check = true; // 다음 입력값부터는 채팅내용으로 받을수 있도록 함
					writer.println(nick + "님이 성공적으로 접속되었습니다!");
				} else {
					// 현재 서버와 연결된 모든 클라이언트 정보 확인 채팅 보내주기!
					for (Socket s : socketList) {
						OutputStream out = s.getOutputStream();
						PrintWriter chatWriter = new PrintWriter(out, true);
						chatWriter.println(nick + " : " + readValue);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
