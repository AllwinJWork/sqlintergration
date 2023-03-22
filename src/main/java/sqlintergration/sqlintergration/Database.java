package sqlintergration.sqlintergration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public void create() {

	}

	public void read() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets", "root", "pass");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// This is a test
}
