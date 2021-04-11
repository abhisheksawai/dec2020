package keywordsinJava;

public class Calculations3 {
	
	static int count = 0 ; // instance variable , when will get memory ? -> when we load the class

	
	public Calculations3()
	{
		count ++;  
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Calculations3 c1 = new Calculations3(); //1
		Calculations3 c2 = new Calculations3(); //2
		Calculations3 c3 = new Calculations3(); //3
		
		
		//123 - rod,jayanta,jithin, sowmya
		//012 - dinesh
		//111 - 
	}
}
