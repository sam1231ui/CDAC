public class p3{
	public static void main(String []args){

		int n=23, i=1;
		boolean flag = false;

		while(i < n){
			if(n%i == 0){
				flag = true;
				break;
			}
		i++;
		}
		if(flag == true)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}