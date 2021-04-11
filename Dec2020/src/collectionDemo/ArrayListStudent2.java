package collectionDemo;

import java.util.ArrayList;

public class ArrayListStudent2 {
	
	public static void main(String[] args) {
		
		ArrayList <Student> a = new ArrayList<>();  //
		a.add(new Student(101, "harshal"));
		a.add(new Student(102, "vishal"));
		a.add(new Student(103, "Jayanta"));
	//	a.add(new Employee(83483, "arun", 1));
		
	//	System.out.println(a);
	//	System.out.println(a.toString());
		
		for( Student b :a )
		{
			
			System.out.println(b.name);
			System.out.println(b.rollno);
		}
		
	
		
	}

}
