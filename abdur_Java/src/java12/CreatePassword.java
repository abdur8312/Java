package java12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreatePassword {
	public boolean create(String passW) {
		/* User enters a password that must contains at least one UpperCase letter, 
		 * one lowerCase letter, one number and one special character followed by
		 * some more characters.
		 * The password must contain minimum of 8 characters to the maximum of
		 * 100 characters. */
		boolean password = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W)"
				+ "[a-zA-Z0-9!@#$%^&*()-_=+;:'\",.?><]{8,100}$", passW);
		return password;
	}
}
