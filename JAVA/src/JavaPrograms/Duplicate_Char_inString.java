package JavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Char_inString {

	public static void main(String[] args) {

		String name="aabbcdeeffgh";
		char[] input=name.toLowerCase().toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		
		for(char ch: input) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
	
		     Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
		     
		    for (Map.Entry<Character, Integer> entry : entryset) {
		    	
		    	if(entry.getValue()>1) {
		    		System.out.println(entry);
		    	}
				
			}
		

	}

}
