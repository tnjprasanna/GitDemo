package progs;

public class MinVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,6,3,2,7,9,1,-2};
		
		int min = Integer.MAX_VALUE;
		
		for(int element : arr) {
			
			if(element<min) {
				min=element;
			}	
		}
		System.out.println(min);

	}
	
	

	

}
