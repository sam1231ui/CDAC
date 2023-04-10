package programs;

public class String9 {
	public static void main(String []args) {
		String str = "welcome";
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				if(temp == str.charAt(j)) {
					count++;
				}
			}
			if(count < 2) {
				System.out.print(temp);
			}
		}
	}

}
