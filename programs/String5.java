package programs;

public class String5 {
	public static void main(String []args) {
			
		String str = "welcome@@";
		for(int i=0; i<str.length(); i++) {
				
			int temp = str.charAt(i);
					
			if(temp>=32 && temp<=47 || temp>=58 && temp<=64 || temp>=91 && temp<=96 || temp>=123 && temp<=126)
				System.out.println(str.charAt(i) + "->" + str.codePointAt(i));
		}
	}

}
