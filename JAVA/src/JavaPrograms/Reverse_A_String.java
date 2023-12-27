package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse_A_String {

	public void usingStringbuffer() {
		
		StringBuffer name=new StringBuffer("Naren");
		//name.append("ABCDE");
		StringBuffer reversed=name.reverse();
		System.out.println(reversed);
		
	}
	
	public void usingownLogic() {
		String name="JAVA";
	
		char[] charArray=name.toCharArray();
		for (int i = charArray.length-1; i >= 0; i--) {
		System.out.print(charArray[i]);
		}
		
	}
	
	public void usingCollections() {
		String name="AUTOMATION";
	 char[] charArray=name.toCharArray();
	  
	 List<Character> list=new ArrayList<Character>();
	 
	 for (Character letter : charArray) {
		list.add(letter);
	}
	 
	 Collections.reverse(list);
	 
	 ListIterator iterator=list.listIterator();
	 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }
		 
	 
	}
	
	public static void main(String[] args) {
		
		Reverse_A_String aString=new  Reverse_A_String();
		aString.usingownLogic();

	}

}
