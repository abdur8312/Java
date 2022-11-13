package java12;

public class ReverseString {
	public String reverse(String inp) {
		int len = inp.length();
		String rev_String = "";
		for(int i = len - 1; i >= 0; i--) {
			char a = inp.charAt(i);
			rev_String = rev_String + a;
		}
		return rev_String;
	}
	public String checkPalindrome(String inp, String rev_Str) {
		if(inp.equals(rev_Str)) {
			return "Palindrome";
		}else {
			return "Not Palindrome";
		}
	}
}
