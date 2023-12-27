package Udemy;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=7;
		int b=17;
		
		/*
		 * int temp=a; a=b; b=temp;
		 */
		
		System.out.println(a);
		System.out.println(b);
		
		a=a+b; //7+17 = 24
		b=a-b; //24-17 = 7
		a=a-b; //24-7 = 17
		
		System.out.println("a:"+a   +"   b:"+b);
		
		

	}

}
