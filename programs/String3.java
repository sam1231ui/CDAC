package programs;

public class String3 {
	public static void main(String []args) {
			
		String str = "Sam";
		for(int i=0; i<str.length(); i++) {
				
			int temp = str.charAt(i);
					
			if(temp>=97 || temp<=122){
				System.out.println(temp);
			}
				
		}
	}

}
