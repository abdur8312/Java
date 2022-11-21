package abdur_Java;
import java.sql.*;

public class DatabaseExample {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection
				("jdbc:postgresql://localhost:5432/abdur", "postgres", "1234");
				/* port-5432 DB_name-abdur user_name-postgres pwd-1234 */
		try {
			//Class.forName("org.postgresql.Driver");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM personal");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + 
									rs.getString(3) + " " + rs.getInt(4));
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}
	}

}
