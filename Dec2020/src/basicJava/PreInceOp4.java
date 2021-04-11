package basicJava;

public class PreInceOp4 {
	
	public static void main(String[] args) {
		
		
		int num1=10;
		int num2=10;
									// [11]   + [11]  = 22
		System.out.println(++num1 + num1++); // 21-savita,prachi, 22-vishal
								// [12]       + [14]
		System.out.println(num1++ + ++num1); // 22-arun , 23-harshal 
		System.out.println(num2++ + ++num2); // 21-harshal , 22arun
									//11    + 11 - ??
									//10    + 12  - arun

	
	}

}
