package progs;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,4,6,9,0,1};
		
		System.out.println(arr.length);
		for(int i=0;i < arr.length;i++) {
			for(int j=i+1; i< arr.length;j++) {
				int temp=0;
				if(arr[i]> arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}			
			}
			System.out.print(arr[i]);
		}
	}
}
