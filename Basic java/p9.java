public class p9{
	public static void main( String []agrs ){
		
		int n=12345, sum=0;

		while(n > 0){
			int rem= n%10;
			sum += rem;
			n /= 10;
		}
		System.out.print(sum);
	}
}