package JavaPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class PrintPatterPrograms {
	
	public void starpattern() {
	int rowlength;
		
		Scanner scanner=new Scanner(System.in);
		rowlength=scanner.nextInt();
		
		for (int row = 0; row < rowlength; row++) {
			
			for (int column = 0; column <=row; column++) {
				
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
	}
	
	public void numberpattern() {
		
		int rowlength;
		Scanner scanner=new Scanner(System.in);
		rowlength=scanner.nextInt();
		int startingNumber=1;
		for (int row = 0; row < rowlength; row++) {
			
			for (int column = 0; column <=row; column++) {
				
				System.out.print(startingNumber+" ");
				startingNumber=startingNumber+1;
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		
		PrintPatterPrograms patterPrograms=new PrintPatterPrograms();
		//patterPrograms.starpattern();
		patterPrograms.numberpattern();

	}

}
