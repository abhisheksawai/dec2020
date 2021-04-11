package basicJava;

public class PreInceOp2 {
	
	public static void main(String[] args) {
		
		int num=100;
	//	System.out.println(num);
		
	//	System.out.println(++num); // 101
		
	//	System.out.println(++num + ++num);
									// [101] + [102] = 203
		
		int num1=10;
		System.out.println(num1++ + num1++);
								// [10]        + [11]  = 21 
	}

}
