package abdur_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TakeDateFormat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<String>();
		System.out.print("Enter no. of dates you want to add : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the date : ");
			String date = sc.next();
			boolean p = Pattern.matches("^\\d\\d\\-\\d\\d\\-\\d\\d\\d\\d|"
					+ "^\\d\\d\\-\\d\\-\\d\\d\\d\\d|"
					+ "^\\d\\-\\d\\-\\d\\d\\d\\d|"
					+ "^\\d\\d\\-\\d\\d\\-\\d\\d|"
					+ "^\\d\\d\\-\\d\\-\\d\\d|"
					+ "^\\d\\-\\d\\-\\d\\d|"
					+ "^\\d\\-\\d\\d\\-\\d\\d\\d\\d", date);
			if(p) {
				li.add(date);
			}
		}
		System.out.println(li);
	}
}
