package sqlintergration.sqlintergration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PetDAO {

	public void create() {

	}

	public void read() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pets", "root", "pass");
			Statement stmnt = conn.createStatement();
			ResultSet results = stmnt.executeQuery("SELECT * FROM pets.info");
			while (results.next()) {
				results.getInt(1);
				results.getInt("id");
				int id = results.getInt("id");
				String name = results.getString("name");
				String breed = results.getString("breed");
				int age = results.getInt("age");
				String colour = results.getString("colour");

				// System.out.println(id);
				// System.out.println(name);
				// System.out.println(breed);
				// System.out.println(age);
				// System.out.println(colour);

				System.out.println(
						"ID: " + id + " Name: " + name + " Breed: " + breed + " Age: " + age + " Colour: " + colour);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// This is a test
}
