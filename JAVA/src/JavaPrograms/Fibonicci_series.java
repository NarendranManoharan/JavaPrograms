package JavaPrograms;

public class Fibonicci_series {

	public static void main(String[] args) {
		
		int count=10;
	int [] num=new int[count];
	 
	num[0]=0;
	num[1]=1;
		
	for(int i=2; i<count; i++) {
		num[i]=num[i-1]+num[i-2];
	}
	
	for(int n: num) {
		System.out.println(n);
	}
	
	
	}
	

}
