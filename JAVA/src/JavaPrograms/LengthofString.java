package JavaPrograms;

public class LengthofString {

	public static void main(String[] args) {
		
		/*String name="Narendran";
		//System.out.println(name.length());
         char[] character=name.toCharArray();
         
         int length = 0;
         for(char nameArray:character){
        	 length++;
         }
         System.out.println(length);*/
         
         
         String whatsUrname="My Name";
        Boolean result=whatsUrname.toLowerCase().matches("[aeiou]");
         System.out.println(result);
	}

}
