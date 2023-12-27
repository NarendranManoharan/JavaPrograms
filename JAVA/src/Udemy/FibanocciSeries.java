package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int i=0;
	    int count=10;
	    while(i<count) {
	    	int c=a+b;
	    	a=b;
	    	b=c;
	    	System.out.println(c);
	    	i++;
	    	
	    }
	
		
	}
}
