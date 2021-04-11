package exceptionDemo;

public class ThrowsDemo2  {
	
	
	static void m1() {
		
		int num=100;
		System.out.println(num/0);
		
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println("last line");
	}

}
