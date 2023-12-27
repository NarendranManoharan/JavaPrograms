package Udemy;

public class Practice {

	public static void main(String[] args) {
		 String s1="Narendran"; 
		System.out.println(s1.substring(3,5));
		 int count=0;
		 
		char[] s= s1.toLowerCase().toCharArray();
		for (char c : s) {
			if(c=='n') {
				count++;
			}
		}
		System.out.println(count);
		 
		
		
	     
	     
		  

	}

}
