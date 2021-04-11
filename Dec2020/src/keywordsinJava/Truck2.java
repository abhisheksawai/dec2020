package keywordsinJava;

public class Truck2 {
	
	int speed=50;
	speed = speed+10;
	static int staticspeed=60 ;
	
	//int mark;  // non static
	//static int rollnumber;
	
	//mark = 56;
	//mark = mark+30;
	
//	int mark1 = 50;
//	mark1 = mark1 +10;
	
//	{
//		mark = 44;
//		mark = mark +30;
//		speed = 50;
//		staticspeed = 60;
//	}
	
	public Truck2()
	{
		//System.out.println(mark);
		System.out.println("speed is "+speed);
		System.out.println("staticspeed is "+staticspeed);
	}
	
	public static void main(String[] args) {
		
		
		Truck2 t1 = new Truck2();
				
	}

}
