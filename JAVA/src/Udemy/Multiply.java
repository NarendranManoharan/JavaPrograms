package Udemy;

public class Multiply {

	public static void main(String[] args) {
		
       multiply(6, 5);
	}
	
	public static void multiply(int a, int b){
		int i=0;
		int multiply=0;
		
		while(i<a) {
			multiply=b+multiply;
			i++;
		}
		System.out.println(multiply);
	}

}
