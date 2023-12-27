package Udemy;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a=684;
		int reverse=0;
		
		while(a!=0) {
		int modulo=a%10; //4
		
		reverse=modulo+reverse*10;
		
		int div= a/10; //68
		a=div;
		}
		System.out.println(reverse);
		
	}
	
}
