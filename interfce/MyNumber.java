package oop.inheritance.interfce;

public class MyNumber implements IntOperations{
	int num;
	
	public MyNumber() {
		num = 0;
	}
	public MyNumber(int num) {
		this.num = num;
	}
	
	//METHODS
	public boolean isOdd(int num) {
		if(num%2 != 0)
			return true;
		else
			return false;
	}
	public boolean isEven(int num) {
		if(num%2 != 0)
			return false;
		else
			return true;
	}
	public boolean isPrime(int num) {
		if(num < 1)
			return false;
		
		if(num == 2)
			return true;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0)
			    return true;
		}
		return true;
	}
	public long calFactorial(int num) {
		long ans = 1;
		
		for(int i=1; i<=num; i++) {
			 ans *= i;
		}
		return ans;
	}
	

}
