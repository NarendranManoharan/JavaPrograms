package JavaPrograms;

import java.util.Scanner;

public class PositionOfAlphabet {

	public static void main(String[] args) {

		//ASCII  97->a, 65->A

		Scanner scanner=new Scanner(System.in);
		char usergivenchar=scanner.next().charAt(0);

		char givenchar=Character.toLowerCase(usergivenchar);
        
	//	int ascii=givenchar;
		int position=givenchar-96;
		
		System.out.println(position);
		

	}

}
