package abdur_Java;

import java.util.Scanner;
import java12.FileHandlingMethods;
import java12.PrimeNumber;

public class Temp2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumber obj = new PrimeNumber();
		FileHandlingMethods obj1 = new FileHandlingMethods();
		String temp = "";
		
		for(int m = 0; m < 3; m++) {
			System.out.print("Enter line number from 1 to 3(order must be maintained) : ");
			int e = sc.nextInt();
			if(e == 1) {
				for(int i = 2; i <= 10; i++) {
					boolean a = obj.checkPrime(i);
					if(a == true) {
						temp = temp + " " + i;
					}
				}
				System.out.println(temp);
				obj1.writeFile("program1", temp);
			}
			else if(e == 2) {
				temp = "";
				for(int j = 11; j <= 20; j++) {
					boolean b = obj.checkPrime(j);
					if(b == true) {
						temp = temp + " " + j;
					}
				}
				System.out.println(temp);
				obj1.append("program1", temp);
			}else if(e == 3) {
				temp = "";
				for(int k = 21; k <= 30; k++) {
					boolean b = obj.checkPrime(k);
					if(b == true) {
						temp = temp + " " + k;
					}
				}
				System.out.println(temp);
				obj1.append("program1", temp);
			}
		}
	}
}
