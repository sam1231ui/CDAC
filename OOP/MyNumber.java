public class MyNumber{

	//Instance
	private int data;
	
	//Constructors
	public MyNumber(){
		data = 0;
	}
	public MyNumber(int data){
		this.data = data;
	}
	
	//Methods
	public boolean isNegative(){
		return (this.data < 0);
	}
	public boolean isPositive(){
		return (this.data > 0);
	}
	public boolean isZero(){
		return (this.data == 0);
	}
	public boolean isEven(){
		return (this.data%2 == 0);
	}
	public boolean isOdd(){
		return (!(this.data%2 == 0));
	}
}
	
	
		