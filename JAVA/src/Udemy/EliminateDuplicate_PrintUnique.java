package Udemy;

import java.util.ArrayList;
import java.util.List;

public class EliminateDuplicate_PrintUnique {

	public static void main(String[] args) {
	
		int[] array= {1,1,1,2,3,3,9,8,8,7,7,7};
		List<Integer> ab=new ArrayList<Integer>();
		
		for (int a : array) {
			for (int i = 0; i < array.length; i++) {
				if(a==array[i]) {
					ab.add(a);	
				}
			}
		}
		System.out.println(ab);
		

	}

}
