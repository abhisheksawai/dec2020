package arraysDemo;

public class CheckArray {
	
	public static void main(String[] args) {
		
		// student s = new student();
		// int i =10;
		int a[] = new int[5]; 
		a[0] = 100;
		a[1] = 300;
		a[2] = 400;
		a[3] = 500;
		a[4] = 600;
		
		// how to print array
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("---");
		
		for(int i =0 ; i < 5; i ++)
		{
			System.out.println(a[i]);
		}
		
	}

}
