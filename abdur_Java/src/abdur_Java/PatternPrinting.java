package abdur_Java;

import java.util.Scanner;

public class PatternPrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = 5; //sc.nextInt(); 
		int col = 6; //sc.nextInt();
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				if(i == 1 || i == row || j == 1 || j == col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
