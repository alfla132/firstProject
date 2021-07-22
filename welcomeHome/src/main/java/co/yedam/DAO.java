package co.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	protected Connection conn;
	protected PreparedStatement psmt;
	protected ResultSet rs;
	protected Statement stmt;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "duchi", "1234");
			System.out.println("connected!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
