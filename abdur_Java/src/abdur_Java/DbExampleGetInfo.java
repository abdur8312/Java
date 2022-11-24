package abdur_Java;
import java.sql.*;

public class DbExampleGetInfo {
	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost"
				+ ":5432/abdur", "postgres", "1234");
		PreparedStatement ps = con.prepareStatement("SELECT * FROM personal");
		ps.executeQuery();
		/* Used to get the meta data of the database tables */
		/* we should use PreparedStatement obj because we're getting the info
		 * of database tables */
		ResultSetMetaData rsmd = ps.getMetaData();
		System.out.println("1st column name : " + rsmd.getColumnName(1));
		System.out.println("2nd column name : " + rsmd.getColumnName(2));
		System.out.println("3rd column name : " + rsmd.getColumnName(3));
		System.out.println("4th column name : " + rsmd.getColumnName(4));
		System.out.println("Total column count : " + rsmd.getColumnCount());
		
		/* Used to get the meta data of the database itself like the version
		 * number, DB name, etc... */
		DatabaseMetaData dmd = con.getMetaData();
		System.out.println("Database name : " + dmd.getDatabaseProductName());
		System.out.println("Database version : " + dmd.getDatabaseProductVersion());
		
	}
}
