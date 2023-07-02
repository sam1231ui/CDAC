package office.utility;

public class Date{
	
	int dd;
	int mm;
	int yy;
	static int count;
	
	static{
		count = 0;
	}
	
	public Date(){
		count++;
		System.out.println("Count of obj: " + count);
		dd = 1;
		mm = 1;
		yy = 1947;	
	}
	
	public Date(int d, int m, int y){
		count++;
		System.out.println("Count of obj: " + count); 
		dd=d;
		mm=m;
		yy=y;
	}

	public void showDate(){
		System.out.print(dd +"/"+mm+"/"+yy);
		System.out.println(" ");
	}
	public void showDate(char ch){
		System.out.print(dd +""+ch+mm+""+ch+yy);
		System.out.println(" ");
	}

	public boolean isLeap(){

		if (yy % 400 == 0)
      			return true;

   		else if (yy % 100 == 0)
      			return false;

   		else if (yy % 4 == 0)
      			return true;
  		else 
      			return false;
   }
}

	
	