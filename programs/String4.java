package programs;

public class String4 {
	public static void main(String []args) {
			
		String str = "welcome@@";
		int v=0, c=0;
		
		for(int i=0; i<str.length(); i++) {
				
			char temp = str.charAt(i);
					
			if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u')
				v++;
			else
				c++;
		}
		System.out.println("No of vowels: "+v);
		System.out.println("No of consonants: "+c);
		
	}

}
