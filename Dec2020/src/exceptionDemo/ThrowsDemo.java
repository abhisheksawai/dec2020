package exceptionDemo;

public class ThrowsDemo {
	
	
	static void m1() throws ArithmeticException{
		
		int num=100;
		System.out.println(num/10);
		
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("last line");
	}

}
