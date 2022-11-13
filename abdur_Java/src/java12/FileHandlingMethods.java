package java12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandlingMethods {
	
	public void createFile(String fileName) {
		try {
			File f1 = new File("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\"+ fileName +".txt");
			f1.createNewFile();
		}catch(IOException e) {
			System.out.println("Catched");
		}
	}
	
	public void writeFile(String fileName, String res) {
		try {
			FileWriter f1w = new FileWriter("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\"+ fileName +".txt");
			f1w.write(res + "\n");
			f1w.close();
		}catch(IOException e1) {
			System.out.println("catched");
		}
	}
	
	public String readFile(String fileName) {
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
	
	public void append(String fileName, String res) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\"+ fileName +".txt", true));
			out.append(res + "\n");
			out.close();
		}catch(IOException e) {
			System.out.println("catched");
		}
	}
}
