package abdur_Java;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		int vow_count = 0, non_vow = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word : ");
		String str = sc.next();
		int n = str.length();
		for(int i = 0; i < n; i++) {
			char a = str.charAt(i);
			if(a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i'
			|| a == 'I' || a == 'o' || a == 'O' || a == 'u' ||
			a == 'U') {
				vow_count += 1;
			}
			else {
				non_vow += 1;
			}
		}
		System.out.println("Total vowels count : " + vow_count);
		System.out.println("Total non-vowels count : " + non_vow);
	}
}
