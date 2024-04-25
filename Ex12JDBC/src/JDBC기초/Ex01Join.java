package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자 입출력 구간
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		// JDBC(Java Data Base Connectivity)
		// 드라이버 로딩 -> 데이터베이스 연결 -> Query전송 -> 결과를 이용한 작업처리 -> 자원반납

		PreparedStatement psmt = null;
		Connection conn = null;
		try { // try구문
				// : 예외가 발생할 수도 있지만, 우선 시도해보는 구간

			/*
			 * JDBC 인터페이스 사용방법! 1. 드라이버 로딩 JDBC 드라이버란? : java에서 제공해주는 인터페이스들을 데이터베이스 회사에서
			 * 상속을 받아서 로직을 구현한 클래스 파일들의 모음
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// ---> 반드시, 프로젝트에 jar 파일을 넣어주기!
			// jar 파일이란?
			// --> 클래스파일들을 여러개 모아놓은 압축파일
			// 프로젝트에 jar 파일 추가 방법
			// 프로젝트 선택 -> 마우스 우클릭 -> build path -> configure build path
			// -> libraries 탭 선택 -> class path 선택 -> 우측 add external jars 버튼 선택
			// -> 원하는 jar파일 경로 선택 -> apply and close

			// 2. 데이터베이스 연결
			// 준비물 3가지
			// 1) 연결경로
			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			// JDBC가 thin 타입이다.
			// @localhost --> ip주소
			// 1521 --> port 번호 myorcle 포트번호 3306
			// xe --> DB 별칭(기본이름)
			// 2) 계정 이름
			String user = "service";
			// 3) 계정 비밀번호
			String paaword = "12345";

			conn = DriverManager.getConnection(ur1, user, paaword);
			// connection이란?
			// : 데이터베이스에 접속하기 위한 모든 메소드를 가진 인터페이스
			// ---> 데이터베이스와 하는 모든 통신은 Connection을 통해서만 이루어진다!
			// connection == MetaData
			// --> 사용 가능한 테이블 목록, 컬럼들에 대한 정보 등 연결된 데이터베이스의 정보들을 전부 가지고 있음!

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 3. Query(SQL구문) 전송
			// 3-1) Query문 전송
			String sql = "INSERT INTO FULLSTACKMEMBER(ID, PW, NAME, AGE, SCORE) VALUES(?, ?, ?, ?, ?)";
			// id -> smhrd
			// pw -> 12345
			// name -> 김성용
			// age -> 20
			// score -> 80
			// 추가할 수 있는 sql구문 작성

			// ?인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간만큼 비워놓고실행하기 전까지 대기

			psmt = conn.prepareStatement(sql);
			// ---> 전송하기 전에 sql문을 담아서 전송할 수 있는 형식으로 변경

			// ?인자 채우는 작업!(반드시 실행 전에 진행할 것!!)
			// 데이터 바인딩 작업(data binding)작업
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);

			// 4. sql구문 실행
			int row = psmt.executeUpdate();

			// 5. 결과를 이용한 작업처리
			// : 사용자한테 어떤 모습을 보여줄 건지 정의
			if (row > 0) {
				System.out.println("회원가입 성공~!");
			} else {
				System.out.println("회원가입 실패 ㅜㅜ");
			}

		} catch (Exception e) {
			// --> 모든 예외클래스는 Exception을 상속받는다!
			// --> Exception e = new ClassNotFoundException();
			// ------->업캐스팅이 일어나는 개념!

			// catch (ClassNotFoundException | SQLException e) {
			// catch 구문
			// --> 예외가 발생했을 때, 어떤 로직을 수행할 지 작성하는 구긴
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 나고 있는지
			// 출력해주는 구문!! ---> 개발할때만 사용하기! ---> 배포할때는 삭제하는것이 좋음

		} finally {
			// 6. DB연결 종료 ---> 자원 반납
			// 열어준 순서의 반대로 자원을 반납해줘야한다!
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
