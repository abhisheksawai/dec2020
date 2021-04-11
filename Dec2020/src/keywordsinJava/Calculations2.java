package keywordsinJava;

public class Calculations2 {
	
	static int count = 0 ; // instance variable , when will get memory ? -> when we load the class

	public Calculations2()
	{
		count ++;  
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Calculations2 c1 = new Calculations2(); //1
		Calculations2 c2 = new Calculations2(); //2
		Calculations2 c3 = new Calculations2(); //3
		
		//123 - rod,jayanta,jithin, sowmya
		//012 - dinesh
		//111 - 
	}
}
