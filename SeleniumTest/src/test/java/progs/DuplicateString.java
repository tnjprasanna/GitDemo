package progs;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"a","bb","c","bb","aa","c"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i].equalsIgnoreCase(arr[j])&& i!=j) {
					System.out.print(arr[j]);
				}
			}
		}
	}
}
