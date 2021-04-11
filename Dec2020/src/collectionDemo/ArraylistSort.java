package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();  
		
		a.add(140);  
		a.add(150);  
		a.add(10);  
		a.add(12);  
		
		Collections.sort(a);
		
		System.out.println(a);
		
		System.out.println("------");
		for(int i =0 ; i < a.size() ; i ++)
		{
			System.out.println(a.get(i));
		}
		
		
		
		
	}

}
