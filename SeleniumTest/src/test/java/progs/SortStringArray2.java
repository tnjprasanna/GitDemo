package progs;

public class SortStringArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrToSort = {"apple", "oranges", "bananas", "Strawberry", "Blueberry"};
		
		for(int i=0;i<arrToSort.length;i++) {
			for(int j=i+1;j<arrToSort.length;j++) {
				 if(arrToSort[i].compareTo(arrToSort[j]) > 0) {
					 String temp = arrToSort[i];
						arrToSort[i] = arrToSort[j];
						arrToSort[j] = temp;
				 }
			} 
			System.out.print(arrToSort[i] + " ");
		}
	}
}


