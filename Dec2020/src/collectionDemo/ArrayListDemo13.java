package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo13 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  // able to create object
		a.add("abhishek");  //0
		a.add(10);  //1
		a.add('Y');  //2
		a.add(10.101); //3
		a.add(true);
		a.add(null);
		//	a.add();
		a.add("abhishek");
		a.add(Integer.valueOf(110));  // till 1.4
		
		System.out.println(a);
		
		ArrayList a1 = new ArrayList(a);  // via const
		
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		System.out.println(a2);
		
		
	}

}
