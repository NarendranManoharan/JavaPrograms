package JAVAConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


public class Set {

	public static void main(String[] args) {
		
		
		//HashSet<String> set= new HashSet<String>();
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		//TreeSet<String> set= new TreeSet<String>();
	
		set.add("a");
		set.add("d");
		set.add("f");
		set.add("b");	
		set.add("e");
		set.add("c");
		set.add("c");
		
		set.add("c");
		//System.out.println(set.subSet("a","d"));
	
		System.out.println(set);
	
		
		 
	   
		
		System.out.println();
	}

}
