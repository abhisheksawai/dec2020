package collectionDemo;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int a=20;  
		int b=230;  
		Integer i = Integer.valueOf(a);
		System.out.println("printing i which is Integer -> "+i);
		
		Integer x;
		x=b;  // automatically conversion 1.5++
		
		System.out.println("priting x here "+x);
		
	}

}
