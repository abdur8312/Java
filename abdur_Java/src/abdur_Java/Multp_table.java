package abdur_Java;

import java.util.Scanner;

public class Multp_table {
	public static void main(String[] args) {
		int inp, inp2, res, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter table number : ");
		inp = sc.nextInt();
		System.out.print("Enter no. upto which you want to print : ");
		inp2 = sc.nextInt();
		for(i = 1; i <= inp2; i++) {
			res = inp * i;
			System.out.println(inp + " x " + i + " = " + res);
		}
	}
}
