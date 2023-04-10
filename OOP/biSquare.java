public class biSquare{
	
	int n;
	
	public biSquare(int num){
		n = num;
	}
	
	public int power(int sq, int m){
		int ans = 1;
		if(m == 0)
			return ans;
		
		while(m != 0){
			ans = ans*sq;
			m--;
		}
		return ans;
	}
		
	
	public void decimal(){
		int count =0;
		double ans = 0;
		while(n > 0){
			int rem = n%10;
			ans = ans+ (rem * power(2,count));
			n /= 10;
			count++;
		}
	}
}
	