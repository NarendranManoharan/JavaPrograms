package JAVAConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class List {

	public static void main(String[] args) {
		
            ArrayList<String> array = new ArrayList<String>(); 
            ArrayList<String> array1 = new ArrayList<String>(); 
            array.add("Chennai");
            array.add("madurai");
            array.add("Trichy");
            array.add(1,"vellore");
            array.add("theni");
            array.add("theni");
            array.add("theni");
            System.out.println(array.get(2));
           
			array.addAll(array1);
            System.out.println(array);
            System.out.println(array1);
            
         
            /*for (String list : array) {
            	System.out.println(list + list.length());*/
            	
            	LinkedList<String> linkedlist = new LinkedList<String>(); 
            	linkedlist.add("Chennai");
            	linkedlist.add("madurai");
            	linkedlist.add("Trichy");
            	linkedlist.add(1,"vellore");
            	linkedlist.add("theni");
            	linkedlist.add("theni");
            	linkedlist.add("theni");
            	linkedlist.addFirst("first");
            	linkedlist.removeFirst();
            	System.out.println(linkedlist);
            	System.out.println(linkedlist.get(2));
            	
				
			}
	}


