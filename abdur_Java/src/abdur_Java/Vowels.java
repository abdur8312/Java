package abdur_Java;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		char inp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		inp = sc.next().charAt(0);
		if(inp == 'a' || inp == 'A' || inp == 'e' || inp == 'E' || inp == 'i'
			|| inp == 'I' || inp == 'o' || inp == 'O' || inp == 'u' ||
			inp == 'U') {
			System.out.println(inp + " is a vowel");
		}else {
			System.out.println(inp + " is not a vowel");
		}
		
	}
}
