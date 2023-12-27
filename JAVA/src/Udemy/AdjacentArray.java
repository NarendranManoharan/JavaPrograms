package Udemy;

public class AdjacentArray {
	
static int min;
static int sum;

	public static void main(String[] args) {
		
		int[] a= {1,6,7,11,12};
		min=Integer.MIN_VALUE;
		for(int i=0; i<a.length-1; i++) {
			 sum=a[i+1]-a[i]; 
			if(sum>min) {		
				min=sum;
			}
		}
		
		System.out.println(min);
	}

}
