package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 id, pw 입력 받기
		// 회원탈퇴 성공 ---> 출력 => 일치하는 행을 찾기
		// 회원탈퇴 실패 ---> 출력
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String ur1 = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String paaword = "12345";

			conn = DriverManager.getConnection(ur1, user, paaword);

			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패!");
			}

			String sql = "delete fullstackmember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int rs = psmt.executeUpdate();

			if (rs > 0) {
				System.out.println("회원탈퇴 성공");
			} else {
				System.out.println("회원탈퇴 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. DB 연결 종료
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
