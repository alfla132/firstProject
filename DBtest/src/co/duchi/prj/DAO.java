package co.duchi.prj;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "duchi";
	private String password = "1234";

	public Connection conn;

	public DAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결성공");
		} catch (Exception e) {
			System.out.println("DB 연결이 안되었거나, 클래스가 없습니다.");
		}
	}
}
