package streams_and_files_io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringInputDemo {
	public static void main(String []args) throws Exception{
		
		// buffer reader object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// user input till stop is entered
		int max =0;
		String ans = "";
		System.out.println("write 'stop' to quit");
		while(br.readLine() != "stop") {
			
				// to check length of String input
				 if(br.readLine().length() > max) {
					 max = br.readLine().length();
					 ans = br.readLine();
				 }
			}
		System.out.println("Longest length String is "+ ans);
	}
}
