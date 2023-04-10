public class p14{
	public static void main(String []args){
		
		int n = 6, i=1, ans =0;
		while(i < n){
			if(n%i == 0)
				ans += i;
		i++;
		}
		if(ans == n)
			System.out.print("Perfect number");
		else
			System.out.print("Not perfect no");
	}
}