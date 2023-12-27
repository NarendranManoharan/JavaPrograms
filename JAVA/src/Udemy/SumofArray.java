package Udemy;

public class SumofArray {

	public static void main(String[] args) {
	int[] array= {1,4,5,7,3,2};
	
        Sumarray(array);
	}
	public static void Sumarray(int[] array){
		int sum=0;
		for(int a: array) {
			sum=a+sum;
		}
		System.out.println(sum);
	}

}
