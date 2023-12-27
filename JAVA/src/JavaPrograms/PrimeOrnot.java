package JavaPrograms;

public class PrimeOrnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10	;
		
		int temp;
		
		temp=num%2;
		if(temp==0) {
			System.out.println("Not prime number");
		}
		else {
			System.out.println("prime number");
		}
	
		int a=0;int b=0; int c=1;
		
		for (int i = 0; i < num; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
		
		
	}

}
