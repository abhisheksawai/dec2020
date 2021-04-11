package keywordsinJava;

public class Truck {
	
	int speed;
	static int staticspeed ;
	
	int mark;  // non static
//	static int rollnumber;
	
//	static
//	{
//		mark = 40;
//		roll = 100;
//	}
	
	
	//	mark = 44;
	//	speed = 50;
	//	staticspeed = 60;
	
	
	public Truck()
	{
		System.out.println("speed is "+speed);
		System.out.println("staticspeed is "+staticspeed);
	}
	
	public static void main(String[] args) {
		
		
		Truck t1 = new Truck();
				
	}

}
