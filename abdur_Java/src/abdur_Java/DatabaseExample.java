package abdur_Java;

import java.sql.*;

public class DatabaseExample {
	public static void main(String[] args) throws SQLException {
		//used to get the connection between java and postgresql
		Connection con = DriverManager.getConnection
				("jdbc:postgresql://localhost:5432/abdur", "postgres", "1234");
				/* port-5432 DB_name-abdur user_name-postgres pwd-1234 */
		try {
			Statement stm = con.createStatement();
//			ResultSet rs = stm.executeQuery("SELECT * FROM personal");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + 
//									rs.getString(3) + " " + rs.getInt(4));
//			}
			/* insert statement */
//			int rs = stm.executeUpdate("INSERT INTO personal VALUES(6, 'faaid', "
//					+ "'madurai',92626)");
//			System.out.println(rs); //prints 1
			
			/* update statement */
//			stm.executeUpdate("UPDATE personal SET name='abdur2138' WHERE ID=4");
			
			/* delete statement */
//			stm.executeUpdate("DELETE FROM personal WHERE ID=2");
			
			/* ascending order statement */
//			ResultSet resSet = stm.executeQuery("SELECT * FROM personal ORDER BY ID ASC");
//			while(resSet.next()) {
//				System.out.println(resSet.getInt(1) + " " + resSet.getString(2) + " " +
//			resSet.getString(3) + " " + resSet.getInt(4));
//			}
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}
	}
}
