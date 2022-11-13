package abdur_Java;

import java.util.Scanner;

public class BiggestOf4Num {
	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A : ");
		a = sc.nextInt();
		System.out.print("Enter the value of B : ");
		b = sc.nextInt();
		System.out.print("Enter the value of C : ");
		c = sc.nextInt();
		System.out.print("Enter the value of D : ");
		d = sc.nextInt();
		
		if(a > b && a > c && a >d) {
			System.out.println("A is Big");
		}else if(b > a && b > c && b >d) {
			System.out.println("B is Big");
		}else if(c > a && c > b && c >d) {
			System.out.println("C is Big");
		}else {
			System.out.println("D is Big");
		}
		
	}
}
