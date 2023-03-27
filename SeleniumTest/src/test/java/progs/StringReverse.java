package progs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "super";
		
		int len = s.length();
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		System.out.print(rev);

	}

}
