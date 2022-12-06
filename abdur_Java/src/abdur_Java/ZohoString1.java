package abdur_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZohoString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int len = input.length();
		List<Character> li = new ArrayList<Character>();
		for(int i = 0; i < len; i++) {
			char t = input.charAt(i);
			li.add(t);
		}
		
		for(int i = li.size()-1; i >= 0; i--) {
			if(li.get(i) == 'a' || li.get(i) == 'e' || li.get(i) == 'i' || 
					li.get(i) == 'o' || li.get(i) == 'u') {
				System.out.println(li.get(i));
				
				
			}
		}
		
	}
}
