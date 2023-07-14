package JavaPrograms;

import java.util.Scanner;

public class Occurence_Of_Char {

	public static void main(String[] args) {
		
		String name="Automation";
		 name=name.toLowerCase();
		//Scanner scanner=new Scanner(System.in);
		//char occurenceChar=scanner.next().charAt(0);
		
		char occurenceChar='a';
		
		
		char[] givenname=name.toCharArray();
		
		
		int num=0;
		for (char ch : givenname) {
			if(ch==occurenceChar) {
				num++;
			}
		}
      System.out.println(num);
	}

}
