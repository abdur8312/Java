package abdur_Java;

import java.util.Scanner;

public class PatternPrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 5; //sc.nextInt(); 
		int c = 6; //sc.nextInt();
		for(int i = 1; i <= r; i++) {
			for(int j = 1; j <= c; j++) {
				if(i == 1 || i == r || j == 1 || j == c) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
