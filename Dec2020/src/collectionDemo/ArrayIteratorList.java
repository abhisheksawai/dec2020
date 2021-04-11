package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIteratorList {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  // able to create object
		a.add("abhishek");
		a.add(10);
		a.add('Y');
		a.add(10.101);
		
		ListIterator ls = a.listIterator();				
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		System.out.println("--");
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
		
		
	}

}
