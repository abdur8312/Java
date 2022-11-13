package java12;

public class Factorial {
	public int getFactorial(int n) {
		int count = 1;
		for(int i = n; i > 0; i--) {
			count *= i;
		}
		return count;
	}
}
