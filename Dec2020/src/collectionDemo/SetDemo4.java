package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo4 {
	
	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<>();  // set doesnot maintain order, duplicate X | capcity 16
		
		s1.add("Arun");
		s1.add("Arun");
		s1.add("jayanta");
	//	s1.add(10);
	//	s1.add('Y');
		s1.add(null);
	//	s1.add(10.13);
		System.out.println(s1);
		System.out.println("------");
		
	
	}

}
