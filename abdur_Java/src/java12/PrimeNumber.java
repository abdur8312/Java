package java12;

public class PrimeNumber {
	public boolean checkPrime(int num) {
		int count = 0;
		if(num >= 2) {
			for(int i = 2; i <= num; i++) {
				if(num % i == 0) {
					count += 1;
				}
			}
		}
		if(count < 2) {
			return true;
		}else{
			return false;
		}
		
	}
}
