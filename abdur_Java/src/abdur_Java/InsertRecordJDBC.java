package abdur_Java;
import java.sql.*;
import java.util.Scanner;

public class InsertRecordJDBC {
	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432"
				+ "/abdur", "postgres", "1234");
		PreparedStatement stm = con.prepareStatement("INSERT INTO personal VALUES"
				+ "(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter Primary key : ");
			int p_key = sc.nextInt();
			System.out.print("Enter name : ");
			String name = sc.next();
			System.out.print("Enter place : ");
			String place = sc.next();
			System.out.print("Enter Mobile number : ");
			long mob_num = sc.nextLong();
			stm.setInt(1, p_key);
			stm.setString(2, name);
			stm.setString(3, place);
			stm.setLong(4, mob_num);
			stm.executeUpdate();
			System.out.print("Do you want to continue(y/n) : ");
			String choice = sc.next();
			if(choice.equals("n")) {
				break;
			}
		}while(true);
		con.close();
	}
}
