package abdur_Java;
import java12.PrimeNumber;
import java12.SubStrInString;
import java12.ReverseString;
import java12.Factorial;
import java12.ArmstrongNumber;
import java12.BubbleSort;
import java12.LinearSearch;
import java12.Fibonacci;
import java12.BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileHandling1{
	void createFile(String fileName) {
		try {
			File f1 = new File("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\"+ fileName +".txt");
			f1.createNewFile();
		}catch(IOException e) {
			System.out.println("Catched");
		}
	}
	void writeFile(String fileName, boolean res) {
		try {
			FileWriter f1w = new FileWriter("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\"+ fileName +".txt");
			f1w.write(res + "\n");
			f1w.close();
		}catch(IOException e1) {
			System.out.println("catched");
		}
	}
	String readFile(String fileName) {
		File f1 = new File("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\"+ fileName +".txt");
		String f1Data = "";
		try {
			Scanner f1r = new Scanner(f1);
			while(f1r.hasNextLine()) {
				f1Data = f1r.nextLine();
				System.out.println(f1Data);
			}
			
			f1r.close();
		}catch(FileNotFoundException e) {
			System.out.println("Exception catched");
		}
		return f1Data;
	}
}

public class Temp5 {
	public static void main(String[] args) {
		/* long start1 = System.currentTimeMillis();
		FileHandling1 obj1 = new FileHandling1();
		obj1.createFile("output");
		
		PrimeNumber obj = new PrimeNumber();
		boolean res = obj.checkPrime(13);
		obj1.writeFile("output", res);
		String s = obj1.readFile("output");
		System.out.println("The value of s is "+s);
		
		if(res == true) {
			System.out.println("Prime");
		}else if(res == false) {
			System.out.println("Not Prime");
		}
		long stop1 = System.currentTimeMillis();
		System.out.println("Total time taken for Prime is "+(stop1 - start1));
		
		long start = System.currentTimeMillis();
		ArmstrongNumber obj1 = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String input = sc.next();
		boolean count = obj1.checkArmstrong(input);
		if(count == true) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
		long stop = System.currentTimeMillis();
		System.out.println("Total time taken for Armstrong is "+(stop - start)); */
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of elements : ");
		int n = sc.nextInt();
		
		LinearSearch obj1 = new LinearSearch();
		List<Integer> inp = obj1.getInput(n);
		System.out.println(inp);
		int element = 3;
		int res = obj1.getIndex(element, n, inp);
		System.out.println("The element is at index " +res);
		*/
		
		/*Fibonacci obj = new Fibonacci();
		int n = 5;
		obj.printFibonacci(n);
		*/
		
		/*Factorial obj = new Factorial();
		int n = 5;
		int result = obj.getFactorial(n);
		System.out.println(result);
		*/
		
		/*BinarySearch obj = new BinarySearch();
		int n = 5;
		List<Integer> li = obj.getInput(n);
		System.out.println(li);
		int inp = 3;
		int res = obj.getIndex(li, n, inp);
		if(res >= 0) {
			System.out.println("Element found at index " +res);
		}else {
			System.out.println("Element not found");
		}
		*/
		
		//ReverseString obj = new ReverseString();
		/*String inp = "madam";
		String rev = obj.reverse(inp);
		String result = obj.checkPalindrome(inp, rev);
		System.out.println(result);
		*/
		
		/*SubStrInString obj1 = new SubStrInString();
		String str = "ABADABAD";
		String sub_Str = "BAD";
		int countLTR = obj1.getSubStrCount(str, sub_Str);
		String rev_str = obj.reverse(str);
		int countRTL = obj1.getSubStrCount(rev_str, sub_Str);
		int totalCount = countLTR + countRTL;
		System.out.print("Total sub string count : " +totalCount);
		*/
		
		
	}
}
