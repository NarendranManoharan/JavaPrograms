package Udemy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {  
    public static void main(String[] args) {  
      
    	String string1="Narendran";
    	char[] name=string1.toLowerCase().toCharArray();
    	Map<Character, Integer> mp=new HashMap<Character, Integer>();
    	
    	for(char i: name) {
    		
    		if(mp.containsKey(i)) {
    			mp.put(i, mp.get(i)+1);
    			
    		}
    		else {
    			mp.put(i, 1);
    		}
    	}
    	
    	System.out.println(mp);
    	  Set<Map.Entry<Character, Integer>> entry=mp.entrySet();
    	  
    	  for (Entry<Character, Integer> entry2 : entry) {
    		  
    		  if(entry2.getValue()==1) {
    			  System.out.println(entry2);
    		  }
			
		}
   }  
    
      
}  