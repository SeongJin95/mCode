package ex02;

import java.sql.*;

public class SQLSelectTest1 {
	public static Connection makeConnection() {
		Connection con = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "exdb";
		String password = "12345";
		try {
			Class.forName(driver);
			System.out.println("jdbc driver 로딩 성공");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 연결 성공");
		} catch (ClassNotFoundException e) {
            System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
            System.out.println("오라클 연결 실패");
		}
		return con;
	}

	public static void main(String[] args) throws SQLException{
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM student");
		while(rs.next()) {
			int stu_no = rs.getInt("stu_no");
			String stu_name = rs.getString("stu_name");
			String stu_dept = rs.getString("stu_dept");
			System.out.println(stu_no + " " + stu_name + " " + stu_dept);
		}
	}

}
