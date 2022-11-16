package java12;

import java.util.regex.Pattern;

public class RegularExp {
	/* return true if the date string is fully written in numbers */
	public static boolean checkDateFormat(String date) {
		boolean res1 = Pattern.matches("^([0-2][1-9]|[1-9]|3[0-1])\\-"
				+ "(0[1-9]|1[0-2]|[1,2,3,4,5,6,7,8,9])\\-"
				+ "(20[0-9][0-9]|0[1-9]|[1-9][0-9]|2100)", date);
		return res1;
	}
	/* return true if the password contains at least One Upp.case,One low.case,
	 * One special char.,One number */
	public static boolean createPassword(String passW) {
		boolean res2 = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*\\W)"
				+ "[a-zA-Z0-9!@#$%^&*()-_=+;:'\",.?><]{8,100}$", passW);
		return res2;
	}
	/* return true if the mobile number ranges from 7 to 15 digit excluding country code
	 * if country code is there means it'll range from 7 to 15 */
	public static boolean getMobNum(String num) {
		boolean res3 = Pattern.matches("^(\\+\\d{1,2})?\\d{7,15}", num);
		return res3;
	}
}
