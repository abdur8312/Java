package abdur_Java;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int inp = sc.nextInt();
		int n = String.valueOf(inp).length();
		for(int i = 0; i < n; i++) {
			int f = inp % 10;
			f = (int) Math.pow(f, n);
			result += f;
			inp /= 10;
		}
		System.out.println(result);
		if(inp != result) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a Armstrong number");
		}
	}
}
