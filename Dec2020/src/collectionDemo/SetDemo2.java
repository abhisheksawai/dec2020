package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
	
	public static void main(String[] args) {
		
		Set s1 = new HashSet();  // set doesnot maintain order
		
		s1.add("abhishek");
		s1.add(10);
		s1.add('Y');
		s1.add(10.13);
		System.out.println(s1);
		System.out.println("------");
		ArrayList a = new ArrayList();  // list maintain order
		a.add("abhishek");  
		a.add(10);  
		a.add('Y');  
		a.add(10.101); 
		System.out.println(a);
	}

}
