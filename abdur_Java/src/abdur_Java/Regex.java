package abdur_Java;

import java12.RegularExp;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		//accepts date, month, year(from 01-01-2000 to 31-12-2099)
		boolean date = Pattern.matches("^([0-2][1-9]|[1-9]|3[0-1])\\-"
				+ "(0[1-9]|1[0-2]|[1,2,3,4,5,6,7,8,9])\\-"
				+ "(20[0-9][0-9]|0[1-9]|[1-9][0-9]|2100)", "5-7-20");
		
		
	/* for Password. Enter the password contains characters(U & l), numbers, special 
	    characters. range is between 8 and 100 */
		boolean password = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W)"
				+ "[a-zA-Z0-9!@#$%^&*()-_=+;:'\",.?><]{8,100}$", "Abdur123@gmail.com");
		//System.out.println(password);

		
		String num = "+917395998312";
		boolean phoneNum = Pattern.matches("^(\\+\\d{1,2})?\\d{7,10}", num);
		//System.out.println(phoneNum);
		
		boolean res1 = RegularExp.getMobNum("9940398212");
		System.out.println(res1);
		boolean res2 = RegularExp.checkDateFormat("01-8-89");
		System.out.println(res2);
		boolean res3 = RegularExp.createPassword("@aIrforce12345");
		System.out.println(res3);
	}
}
