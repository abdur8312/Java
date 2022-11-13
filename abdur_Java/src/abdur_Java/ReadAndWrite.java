package abdur_Java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		/* File f = new File("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\readAndWrite.txt");;
		try {
			if(f.createNewFile()) {
				System.out.println("Created new file.");
			}else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			System.out.println("catched");
		}
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\readAndWrite.txt");
			fw.write("abdur\n");
			fw.write("rahman");
			
		}catch(IOException e) {
			System.out.println("catched");
		}finally {
			fw.close();
		}
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("catched");
		}	*/
		
		try (FileReader fr = new FileReader("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\readAndWrite.txt");
			    BufferedReader br = new BufferedReader(fr);){
			    String line = br.readLine();
			    System.out.println(line);
		}catch(FileNotFoundException fnf) {
			    fnf.printStackTrace();
		} 
		
		
	}
}
