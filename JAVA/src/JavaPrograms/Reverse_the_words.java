package JavaPrograms;

public class Reverse_the_words {


	
	public static void main(String[] args) {
		
		String identity="My name is NAREN";
		String[] identitySplit=identity.split(" ");
		
		
		
		for (int i = identitySplit.length-1; i >=0; i--) {
			
			System.out.print(identitySplit[i]+" ");
			
		}
		System.out.println(" ");
		String s1="abc";
		String s2="defg";
		String s3="hij";
		
		String appended=s1.concat(s2).concat(s3);
		
		StringBuffer s=new StringBuffer(s1);
		s.append(s2);
		s.append(s3);
	
       System.out.println(appended);
		
	}

}
