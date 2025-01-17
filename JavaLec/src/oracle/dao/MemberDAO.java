package oracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "c##sahmyook";
	String password = "qwer1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public ArrayList<MemberVO> list() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();

		try {
			connDB();

			String query = "SELECT * FROM emp";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");

				MemberVO data = new MemberVO(empno, ename, sal);
				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement();
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
