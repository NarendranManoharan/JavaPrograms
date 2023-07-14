package JavaPrograms;

public class SwapTwoNumbers {

	public void usingThirdVariable() {
		int me=20;
		int superior=50;


		System.out.println("Before Swapping: " +"Mine: "+me+" superior: "+superior);

		int thirdperson=me;
		me=superior;
		superior=thirdperson;

		System.out.println("Before Swapping: " +"Mine: "+me+" superior: "+superior);


	}
	
	public void withoutUsingThirdVariable() {
		int me=150;
		int superior=300;
		System.out.println("Before Swapping: " +"Mine: "+me+" superior: "+superior);
		
		me=me-superior; //150-300=-150
		superior=me+superior; //-150+300=150
		me=superior-me; //150-(-150)=300
		
		System.out.println("Before Swapping: " +"Mine: "+me+" superior: "+superior);
	}
	
	

	public static void main(String[] args) {

		SwapTwoNumbers numbers=new SwapTwoNumbers();
		numbers.withoutUsingThirdVariable();
	}

}
