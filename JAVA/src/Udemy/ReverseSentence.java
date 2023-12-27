package Udemy;

public class ReverseSentence {

	public static void main(String[] args) {
		
		reverse("My name is Narendran");
		
	}
	
	public static void reverse(String sent){
		String sentence=sent;
		String reverse="";
		String[] word=sentence.split(" ");
		
			
			for(int i=word.length-1; i>=0; i--) {
				reverse=reverse+word[i]+" ";
			}
			
		System.out.println(reverse);

	}
	
	
	
	
	public static void reverseSentece(String sent){
		String sentence=sent;
		String reverse="";
		String[] word=sentence.split(" ");
		
		for(String singwor: word) {
			
			for(int i=singwor.length()-1; i>=0; i--) {
				reverse=reverse+singwor.charAt(i);
			}
			reverse=reverse+" ";
		}
		System.out.println(reverse);

	}

}
