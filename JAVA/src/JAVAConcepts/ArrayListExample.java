package JAVAConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		 
		  List<String> array = new ArrayList<String>(); 
		  array.add("MC00");
		  array.add("LN00");
		  array.add("SG00"); 
		  array.add("IN00");
		  System.out.println(array); 
		  System.out.println(array.size());
		  
		  
		  
		  
		  for (int i = 0; i < array.size(); i++) { 
			  System.out.println(array.get(i));
			  }
		  
		  
		  
		  for (String string : array) { System.out.println(string); }
		  
		  
		  ListIterator<String> iterator=array.listIterator();
		  while(iterator.hasNext())
		  { System.out.println(array); }
		 
		
		  
	}
}
