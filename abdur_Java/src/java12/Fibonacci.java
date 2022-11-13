package java12;

public class Fibonacci {
	public void printFibonacci(int n) {
		int a = 0, b = 1, c;
		if(n <= 2) {
			System.out.println(a);
			System.out.println(b);
		}else if(n > 2) {
			System.out.println(a);
			System.out.println(b);
			for(int i = 2; i < n; i++) {
				c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
	}
}
