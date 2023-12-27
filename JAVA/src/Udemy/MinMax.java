package Udemy;

public class MinMax {
	
	public static void main(String[] args) {
		int[] array= {1,54,5,8,5,97};
		System.out.println("Minvalue: "+findMinValue(array));
		System.out.println("Maxvalue: "+findMaxValue(array));

	}
	
	public static int findMinValue(int[] num){
		
	      int min =Integer.MAX_VALUE;
	     for(int a:num) {
	    	 
	    	 if(a<min) {
	    		 min=a;
	    	 }
	     }
	 
		return min;
	}
	
	public static int findMaxValue(int[] num){
		
		int max =Integer.MIN_VALUE;
	     for(int a:num) {
	    	 
	    	 if(a>max) {
	    		 max=a;
	    	 }
	     }
	   
		return max;
	}


}
