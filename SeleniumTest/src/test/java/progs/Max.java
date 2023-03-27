package progs;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,5,8,6,7,1,5};
		int max = Integer.MIN_VALUE;
		//System.out.println(max);
			for(int element : arr) {
				if(element > max) {
					max=element;
				}
			}
			System.out.println(max);
	}
}
