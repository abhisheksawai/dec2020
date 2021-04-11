package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
	
	public static void main(String[] args) {
		
		Set s1 = new HashSet();  // set doesnot maintain order, duplicate X | capcity 16
		
		s1.add("Arun");
		s1.add("Arun");
		s1.add(10);
		s1.add('Y');
		s1.add(null);
		s1.add(10.13);
		System.out.println(s1);
		System.out.println("------");
		ArrayList a = new ArrayList();  // list maintain order duplicate possible | capacity 10
		a.add("abhishek");  
		a.add("abhishek");  
		a.add(10);  
		a.add('Y');  
		a.add(10.101); 
		System.out.println(a);
	}

}
