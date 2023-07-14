package JavaPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class find_element_in_Array {

	public static void main(String[] args) {
		
		int[] array= {1, 2, 3, 4, 5};
		
		int numberToFind=2;
		
		Boolean found=false;
		
		for (int number : array) {
			if(number==numberToFind) {
				found=true;
			}
		}
 
		if(found==true) {
			System.out.println("Number present");
		}
		else {
			System.out.println("Number not present");
		}
	}

}
