package abdur_Java;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value(value >= 2) : ");
		int n = sc.nextInt();
		if(n == 2) {
			System.out.println(a);
			System.out.println(b);
		}else if(n > 2) {
			System.out.println(a);
			System.out.println(b);
			for(int i = 2; i < n; i++) {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
		
	}
}
