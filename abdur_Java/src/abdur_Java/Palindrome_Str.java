package abdur_Java;

import java.util.Scanner;

public class Palindrome_Str {
	public String reverse(String input) {
		int n = input.length();
		String rever = "";
		for(int i = 0; i < n ; i++) {
			char ch = input.charAt(i);
			rever = ch + rever;
		}
		return rever;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String input = sc.next();
		
		Palindrome_Str obj = new Palindrome_Str();
		String rev = obj.reverse(input);
		
		if(input.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
}
