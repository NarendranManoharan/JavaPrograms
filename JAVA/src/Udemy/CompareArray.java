package Udemy;

import java.util.ArrayList;
import java.util.List;

public class CompareArray {

	public static void main(String[] args) {
		//compare same indexes of 2 different arrays and create another array for matching values
		
		int a[]  = {1,4,5,7};
		int b[]= {6,4,3,7}; 
		List<Integer> c=new ArrayList<>();
		for(int i=0; i<a.length; i++) {
		   if(a[i]==b[i]) {
			   c.add(b[i]);
			   
		   }
		}
		System.out.println(c);
	}
}
