package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallesrNuminArray {

	int arraylength[]= {5,3,2,4,1};
	
	public void usingArrays() {
		Arrays.sort(arraylength);
		System.out.println(arraylength[0]);
	}
	public void usingCollections() {
		
		List list=Arrays.asList(arraylength);
		Collections.sort(list);
		System.out.println(list.get(0));
	}
	
	public void usingLogic() {
		int smallest=Integer.MAX_VALUE;
		for (int i = 0; i < arraylength.length; i++) {
			if(arraylength[i] < smallest) {
				smallest=arraylength[i];
			}
			
		}
		System.out.println(smallest);                                                          
	}
	
	
	public static void main(String[] args) {
		
		SmallesrNuminArray smallestnum=new SmallesrNuminArray();
		//smallestnum.usingArrays();
		//smallestnum.usingCollections();
		smallestnum.usingLogic();
	}

}
