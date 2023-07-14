package JAVAConcepts;

public class StringvsStringBuffer {

	public static void main(String[] args) {
		StringBuffer ex =new StringBuffer("AUTOMATION");
		  System.out.println(ex.replace(0, 5, "naren")); System.out.println(ex);
		 
		
		String ex1 ="AUTOMATION";
	     System.out.println(ex1.replace("AUTO", "nare"));
		System.out.println(ex1);
	}

}
