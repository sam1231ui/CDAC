package streams_and_files_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ContentCopyDemo {

	public static void main(String[] args) throws Exception{
		
		// user input for file name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file name\n");
		String file_name1 = sc.next();
		System.out.println("Enter destination file name\n");
		String file_name2 = sc.next();
		sc.close();
		
		//writer object
		Writer w = new FileWriter("D:\\eclipse-workspace\\"+file_name2+".txt");
		
		//reading file object 
		Reader r = new FileReader("D:\\eclipse-workspace\\"+file_name1+".txt");
		int n;
		
		// file copying loop
		while((n = r.read()) != -1) {
			w.write((char)(n));
			}
		r.close();
		w.close();
		
	}

}
