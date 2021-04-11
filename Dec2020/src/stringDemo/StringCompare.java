package stringDemo;

public class StringCompare {
	
	public static void main(String[] args) {
		
		
		String s0 = "Harshal";
		String s1 = "Harshal";
		String s2 = new String("Harshal");
		String s3 = "harshal";
		String s4 = "Jayanta";
		
		System.out.println(s0.equals(s1));  // true
		System.out.println(s0.equals(s2));  // true - divyani,harshal,dinesh,
		System.out.println(s0.equals(s3));  //false - rod,divyani,harshal,jayanta
		System.out.println(s0.equals(s4));  //false - rod,divyani
		
		System.out.println(s1.equals(s2)); //true - jayanta, harshal divyani
		System.out.println(s2.equals(s3)); // false- jayanta, harshal divyani
		System.out.println(s1.equals(s3)); // false- jayanta, harshal divyani
		
		
		
		
		
	}

}
