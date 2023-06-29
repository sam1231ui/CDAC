package streams_and_files_io;

import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class SrNumberDemo {

	public static void main(String[] args) throws Exception{
		
		// user input for file name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file name\n");
		String file_name1 = sc.next();
		sc.close();
		
		
		//reading file object 
		Reader r = new FileReader("D:\\eclipse-workspace\\"+file_name1+".txt");
		int n;
		int count = 1;
		boolean flag = false;
		
		// Sr number display loop
		System.out.print(count+".");
		while((n = r.read()) != -1) {
				if(((char)n) == '\n') {
					flag = true;
					count++;
					continue;
				}
				if(flag == true) {
					System.out.print(count+".");
					System.out.print((char)n);
					flag = false;
				}else
					System.out.print((char)n);
			}
		r.close();
		
	}

}
