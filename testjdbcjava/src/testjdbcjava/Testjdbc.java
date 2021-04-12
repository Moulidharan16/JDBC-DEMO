package testjdbcjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Testjdbc {

	public static void jdbc(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			Statement stm = con.createStatement();
			String create = "CREATE TABLE student(id  INTEGER PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(20),place VARCHAR(20),department VARCHAR(20),mobile VARCHAR(12))";
			stm.execute(create);
			System.out.println("Table Created Successfully");
		} catch (Exception e) {
			System.out.println("Exception Occur " + e);
		}
	}

	
}
