package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  // able to create object
		a.add("abhishek");
		a.add(10);
		a.add('Y');
		a.add(10.101);
		a.add(true);
		a.add(null);
		//	a.add();
		a.add("abhishek");
		a.add(Integer.valueOf(110));  // till 1.4
		System.out.println(a);
		System.out.println("size is-> "+a.size());
		
		
	}

}
