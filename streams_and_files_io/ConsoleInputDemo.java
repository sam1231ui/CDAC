package streams_and_files_io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConsoleInputDemo {
	public static void main(String []args) throws Exception{
		
		// buffer reader object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// user input till q is entered
		int n;
		int count1 =0;
		int count2 =0;
		System.out.println("write 'q' to quit");
		while((n = br.read()) != 'q') {
				if(n >= 65 && n <= 90 || n >=95 && n<=122)
					count1++;
				else
					count2++;
			}
		System.out.println(count1+" is char counts\n "+count2+" is num counts");
	}
}
