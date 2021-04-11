package basicJava;

public class Operator1 {
	
	public static void main(String[] args) {
		
		int num=10;
		int check;
		System.out.println(num); // 10
		System.out.println(num++); // 10   ||  [11]
		check = num++; // [12]
		System.out.println(check); // ?? 11
		System.out.println("line 13--> "+num);
		
		//System.out.println(num); // 10
		//System.out.println(num++); // 10
		//System.out.println(num++); // 11
		
		//System.out.println(num++); // ??
		
		
	}

}
