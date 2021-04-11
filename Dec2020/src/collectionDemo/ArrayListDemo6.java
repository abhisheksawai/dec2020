package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  // able to create object
		a.add("abhishek");  //0
		a.add(10);  //1
		a.add('Y');  //2
		a.add(10.101);
		a.add(true);
		a.add(null);
		//	a.add();
		a.add("abhishek");
		a.add(Integer.valueOf(110));  // till 1.4
		
		System.out.println(a);
		System.out.println(a.size());
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		System.out.println(a.get(4));
		System.out.println(a.get(5));
		System.out.println(a.get(6));
		System.out.println(a.get(7));
		
		
		
		
	}

}
