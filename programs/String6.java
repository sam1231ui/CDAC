package programs;

public class String6 {
	public static void main(String []args) {
			
			int count = 0;
			String str = "weLcome123";
			
			for(int i=0; i<str.length(); i++) {
				
				int temp = str.charAt(i);
				
				if((temp >= 65 && temp <= 90)){
					count++;
				}else if((temp >= 97 && temp <= 122)){
					count++;
				}else {
					count++;
				}				
			}
			if(count >= 3)
					System.out.println("All 3 present");
			else if(count >= 2)
				System.out.println("2 present");
			else
				System.out.println("nothing");
	}

}
