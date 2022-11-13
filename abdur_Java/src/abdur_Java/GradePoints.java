package abdur_Java;

import java.util.Scanner;

public class GradePoints {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mark(0 - 100) : ");
		input = sc.nextInt();
		
		if(input <= 100 && input >= 90) {
			System.out.println("Grade O");
		}else if(input <= 89 && input >= 80) {
			System.out.println("Grade D+");
		}else if(input <= 79 && input >= 75) {
			System.out.println("Grade D");
		}else if(input <= 74 && input >= 70) {
			System.out.println("Grade A+");
		}else if(input <= 69 && input >= 60) {
			System.out.println("Grade A");
		}else if(input <= 59 && input >= 50) {
			System.out.println("Grade B");
		}else {
			System.out.println("Re-Appear");
		}
		
	}
	
	
}
