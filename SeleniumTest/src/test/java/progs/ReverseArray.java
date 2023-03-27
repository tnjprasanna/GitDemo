package progs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,6,3,2,7,9,1};
		int arrlen = arr.length;
		
		for(int i= arrlen-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
