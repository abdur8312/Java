package abdur_Java;
import java.sql.*;
import java.util.Scanner;

public class UpdateRecordJDBC {
	public static void main(String[] args) throws SQLException{
		/* Establishes the connection to PostgreSQL DB */
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:"
				+ "5432/abdur", "postgres", "1234");
		do {
			/* Pre-compiled and Parameterized(?) SQL query statement */
			PreparedStatement stm = con.prepareStatement("UPDATE personal SET name = ?"
					+ " WHERE id = ?");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter New name : ");
			String New_name = sc.next();
			System.out.print("Enter the ID to be edited : ");
			int id = sc.nextInt();
			/* used to set the inputs to the parameters */
			stm.setString(1, New_name);
			stm.setInt(2, id);
			stm.executeUpdate();
			System.out.print("Do you want to continue Edit(y/n) : ");
			String choice = sc.next();
			if(choice.equals("n")) {
				sc.close();
				break;
			}
		}while(true);
		con.close();
	}
}
