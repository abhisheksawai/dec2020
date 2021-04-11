package collectionDemo;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		int x = 130;
		System.out.println("printing num her "+x);
		
		Byte b = (byte) x;  // explicit typecast , may loss of info
		System.out.println("after conversion "+b);
		
	}

}
