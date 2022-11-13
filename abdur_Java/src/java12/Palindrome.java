package java12;

public class Palindrome {
	public boolean checkPalindrome(String str) {
		int lenOfString = str.length();
		//To reverse the string
		String rev = "";
		for(int i = lenOfString - 1; i >= 0; i--) {
			char a = str.charAt(i);
			rev += a;
		}
		//To compare both original and reversed Strings
		if(str.equals(rev)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkPalindrome(int inp) {
		int rev = 0, temp = inp;
		//To reverse the number
		while(temp > 0) {
			int a = temp % 10;
			rev = (rev * 10) + a;
			temp /= 10;
		}
		//To compare both original and reversed integers
		if(inp == rev) {
			return true;
		}else {
			return false;
		}
	}
}
