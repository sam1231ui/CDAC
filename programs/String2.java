package programs;

public class String2 {
	public static void main(String []args) {
			
			String str = "welcome";
			for(int i=0; i<str.length(); i++) {
				
					System.out.println(str.codePointAt(i));
			}
	}

}
