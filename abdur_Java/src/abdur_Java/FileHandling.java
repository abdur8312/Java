package abdur_Java;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) throws IOException {
//		String a = "abdur";
//		File f1 = new File("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\one.txt");
//		FileWriter f1w = new FileWriter("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\one.txt");
//		f1w.write("Hi "+ a +" This is my first file creation and writing\n");
//		f1w.write("This is the second line\n");
//		f1w.write("Third line");
//		f1w.close();
//		
//		Scanner f1r = new Scanner(f1);
//		/*while(f1r.hasNextLine()) {
//			String f1Data = f1r.nextLine();
//			System.out.println(f1Data);
//		}
//		f1r.close(); */
//		int n = 1;
//		String line3 = Files.readAllLines(Paths.get("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Java_File_Handling\\one.txt")).get(n-1);
//		System.out.println(line3);
		
		try {
			Path file = Paths.get("C:\\Users\\abdur\\Documents\\abdur_temp\\abdur8312\\Git_Java\\Java\\abdur_Java\\src\\module-info.java");
			BasicFileAttributes bfa = Files.readAttributes(file, BasicFileAttributes.class);
			System.out.println("Creation time : " + bfa.creationTime().toString());
			System.out.println("Last access time : " + bfa.lastAccessTime().toString());
			System.out.println("Last modified time : " + bfa.lastModifiedTime().toString());
			System.out.println("File name : \"" + file.getFileName() + "\"");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
