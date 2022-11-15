package java12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TakeDateFormat {
	public List<String> addDateToList(int n){
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			System.out.print("Enter the date : ");
			String date = sc.next();
			boolean p = Pattern.matches("^([0-2][0-9]|[0-9]|3[0-1])\\-"
					+ "(0[1-9]|1[0-2]|[1,2,3,4,5,6,7,8,9])\\-"
					+ "(20[0-9][0-9]|0[1-9]|[1-9][1-9]|2100)", date);
			if(p) {
				li.add(date);
			}
		}
		sc.close();
		return li;
	}
}
