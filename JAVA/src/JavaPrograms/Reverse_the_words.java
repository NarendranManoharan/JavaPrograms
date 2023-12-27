package JavaPrograms;

public class Reverse_the_words {


	
	public static void main(String[] args) {
		
		String identity="My name is NAREN";
		String[] identitySplit=identity.split(" ");
		
		
		
		for (int i = identitySplit.length-1; i >=0; i--) {
			
			System.out.print(identitySplit[i]+" ");
			
		}
		System.out.println(" ");
	
		
	}

}
