package Udemy;

public class Reverseastring_Palindrome {

	public static void main(String[] args) {
		 reverseusingDiffmethod("madam");

	}

	public static void reverseusingDiffmethod(String word) {
		String a=word;
		String b="";
		char[] name=a.toLowerCase().toCharArray();
		
	for(int i=name.length-1; i>=0; i--) {
		b=b+name[i];
	}
	System.out.println(b);
	
	if(a==b) {
		System.out.println("This String is Palindrome");
	}
	else {
		
		System.out.println("This String is not a Palindrome");
	}
	}
	
	
	
	public static void reverse(String word) {
		String a=word;
		 String b=""; 
		 for(int i=a.length()-1; i>=0; i--) {
		       b=b+ a.charAt(i);
		 }
		 System.out.println(b);
	}

}
