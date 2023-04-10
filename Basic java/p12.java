public class p12{
	public static void main(String []args){
		
		int i=1 , ans =0, n = 153, temp = n;
		int count =0;

		while(temp > 0){
			count++;
			temp /= 10;
		}
		temp = n;
		while(temp > 0){
			int r = temp%10;
			int rem = 1;
			for(int j=0; j<count; j++)
				rem = rem*r;
			ans += rem;
			temp = temp/10;
		}
		
		if(ans == n)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstong");
	}
}