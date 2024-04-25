package Membercontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameMemberDAO {

	private ResultSet rs = null;
	private Connection conn = null;
	private PreparedStatement psmt = null;

	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String ur1 = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String user = "campus_24SW_FS_p1_5";
			String paaword = "smhrd5";
			conn = DriverManager.getConnection(ur1, user, paaword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 사용한 자원 반납하는 메소드
	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int join(GameMemberDTO dto) {

		int row = 0;
		try {
			getConn();
			String sql = "INSERT INTO gamemember(ID, PW, NAME, AGE, EMAIL, GENDER) VALUES(?, ?, ?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setString(5, dto.getEmail());
			psmt.setString(6, dto.getGender());

			row = psmt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	public int join2(GameMemberDTO dto) {

		int row2 = 0;
		try {
			getConn();
			String sql = "INSERT INTO memberrank(ID, NAME, SCORE) VALUES(?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getName());
			psmt.setInt(3, dto.getScore());

			row2 = psmt.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row2;
	}

	public String login(GameMemberDTO dto) {
		String uName = null;
		try {
			getConn();
			String sql = "SELECT * FROM gamemember WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				uName = rs.getNString("name");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return uName;
	}

	public ArrayList<GameMemberDTO> selectAll() {
		GameMemberDTO dto = null;
		ArrayList<GameMemberDTO> list = new ArrayList<GameMemberDTO>();
		try {
			getConn();
			String sql = "SELECT * FROM memberrank ORDER BY score DESC";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			while (rs.next()) {
				dto = new GameMemberDTO(rs.getNString("id"), rs.getInt("score"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

}
