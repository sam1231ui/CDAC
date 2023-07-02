public class bi{
	
	int n;
	
	public bi(int num){
		n = num;
	}
	
	 void decimal(){
		int count =0;
		double ans = 0;
		while(n > 0){
			int rem = n%10;
			ans = ans + (rem * (Math.pow(2,count)));
			n /= 10;
			count++;
		}
	}
}
	