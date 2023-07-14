package JAVAConcepts;


public class practicecode {
	 static String day="wednesday";
	 static String dayString;
	 static {
		 System.out.println("static block");
	 }
	public void weekdays(){
	      
		switch(day) {
		case "monday":	
			break;
		case "tuesday":	
			break;
		case "wednesday":

 		case "thursday":

		case "friday":
			dayString="weekday";
			//System.out.println("weekday");	
			break;
		case "saturday":
		case "sunday":
			//System.out.println("weekend");
			dayString="weekend";
			break;
		
			default:
				System.out.println("Invalid day");
		}
		System.out.println(day+ " is "+ dayString);
	}
	
	public static void main(String[] args) {
		
		practicecode switchcode=new practicecode();
		switchcode.weekdays();
		
	}
}
