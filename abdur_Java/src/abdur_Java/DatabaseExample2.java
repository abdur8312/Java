package abdur_Java;
import java.sql.*;

public class DatabaseExample2 {
	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432"
				+ "/abdur", "postgres", "1234");
		PreparedStatement stm = con.prepareStatement("INSERT INTO personal VALUES(?,?,?,?)");
		stm.setInt(1, 8);
		stm.setString(2, "iqbal");
		stm.setString(3, "ilayangudi");
		stm.setInt(4, 7369);
		stm.executeUpdate();
		//System.out.println(i);
		
		con.close();

	}

}
