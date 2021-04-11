package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  // able to create object
		a.add("abhishek");
		a.add(10);
		a.add('Y');
		a.add(10.101);
		
	//	Iterator i = new Iterator();  // class or interface ? iterator is interface
		
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
		
		
		
	}

}
