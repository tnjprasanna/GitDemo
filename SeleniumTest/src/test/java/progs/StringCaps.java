package progs;

public class StringCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "this is prasanna";
		
		String words[] = s.split("\\s");
		String result = "";
		
		for(String w : words) {
	
			String first = w.substring(0,1).toUpperCase();
			String restString = w.substring(1);
			result = result + first + restString + " ";
		}
		System.out.println(result);
	}

}
