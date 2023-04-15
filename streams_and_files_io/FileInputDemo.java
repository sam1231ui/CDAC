package streams_and_files_io;

import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileInputDemo {

	public static void main(String[] args) throws Exception{
		
		// user input for file name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String file_name = sc.next();
		System.out.println("Enter content of file ");
		String content = sc.next();
		sc.close();
		 
		
		
 
		//writer object
		Writer w = new FileWriter("D:\\eclipse-workspace\\"+file_name+".txt");
		w.write(content);
		w.close();
		
		
		//reading file object 
		Reader r = new FileReader("D:\\eclipse-workspace\\"+file_name+".txt");
		int n;
		while((n = r.read()) != -1) {
			System.out.print((char)n);
		}
		r.close();
	}
}
				