package abdur_Java;

import java12.CreatePassword;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		//accepts date, month, year(from 01-01-2000 to 31-12-2099)
		boolean date = Pattern.matches("^([0-2][0-9]|[0-9]|3[0-1])\\-"
				+ "(0[1-9]|1[0-2]|[1,2,3,4,5,6,7,8,9])\\-"
				+ "(20[0-9][0-9]|0[1-9]|[1-9][1-9]|2100)", "02-7-2100");
		
	/* for Password. Enter the password contains characters(U & l), numbers, special 
	    characters. range is between 8 and 100 */
		boolean password = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W)"
				+ "[a-zA-Z0-9!@#$%^&*()-_=+;:'\",.?><]{8,100}$", "Abdur123@gmail.com");
		//System.out.println(password);
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Password : ");
		String passW = sc.next();
		CreatePassword obj = new CreatePassword();
		boolean b = obj.create(passW);
		System.out.println(b);
	}
}
