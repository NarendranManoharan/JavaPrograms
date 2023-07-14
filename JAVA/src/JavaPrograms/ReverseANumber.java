package JavaPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		int number=0;
		Scanner scanner=new Scanner(System.in);
		number=scanner.nextInt();
		int reversednumber = 0;

		while(number!=0) {
		reversednumber=reversednumber*10;
		reversednumber=reversednumber+number%10;
		number=number/10;
		}
          System.out.println(reversednumber);

	}

}
