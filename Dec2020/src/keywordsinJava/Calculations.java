package keywordsinJava;

public class Calculations {
	
	int count = 0 ; // instance variable , when will get memory ? -> when we create object

	public Calculations()
	{
		count ++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Calculations c1 = new Calculations();
		Calculations c2 = new Calculations();
		Calculations c3 = new Calculations();
		
		//123 - sowmya savita
		//012 - dinesh, sowmya,divyani
		//111 - jaynta rod
	}
}
