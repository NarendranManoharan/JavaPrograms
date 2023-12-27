package JavaPrograms;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String s1="Sachin";
		String s2="Tendulkar";
		
		s1=s1+s2;
		
		
		s2=s1.substring(0, s1.length()-s2.length());
				System.out.println("S2= "+s2);
				
		s1=s1.substring(s2.length());
		System.out.println("S1= "+s1);
		
		

	}

}
