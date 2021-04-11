package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo9 {
	
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
		System.out.println(a.size());
		System.out.println("------");
		for(int i =0 ; i < a.size() ; i ++)
		{
			System.out.println("i value is "+i+" "+a.get(i));
		}
		
		System.out.println("replace data");
		a.set(3, "11.112");
		
		System.out.println(a);
	}

}
