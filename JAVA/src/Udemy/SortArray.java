package Udemy;

import java.util.Iterator;

public class SortArray {

	public static void main(String[] args) {
		
		int a[]= {2,6,1,4,9,0,-2}; 
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int array: a) {
			System.out.println(array);
		}
	}
	

}
