package abdur_Java;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int i, input, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		input = sc.nextInt();
		for(i = 2; i <= input/2; i++) {
			if(input % i == 0) {
				count = 1;
			}
		}
		if(count == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
