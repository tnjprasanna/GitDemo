package progs;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Selenium";
		int strLen = s.length();
		char revChar;
		String revStr="";
		
		for(int i=strLen-1;i>=0;i--){
			
			revChar = s.charAt(i);
			 System.out.print(revChar);
			 
			 revStr = revStr + s.charAt(i);
			
			}System.out.println();
		 	System.out.println(revStr);
		 	
		 	StringBuffer sf = new StringBuffer(s);
		 	System.out.println(sf.reverse());
		 	
		 	String str1 = "testWIN@!#$@#45";
		 	String str2=str1.replaceAll("[^a-zA-Z0-9]", "");
		 	System.out.println(str2);
		 	
		 	//1. Rev Int
		 	int num1 = 123456;
		 	int revInt=0;
		 	while(num1!=0) {
		 		revInt = num1%10;
		 		System.out.print(revInt);
		 		num1/=10;
		 	}
		 	//2. Rev Int
		 	int num2=789, revInt2 = 0;
		 	while(num2!=0) {
		 		revInt2 = revInt2 *10 + revInt2%10;
		 		num2/=10;
		 	}
		 	System.out.println("Reverse Num: "+revInt2);
		 	
		 	long num3 = 65432;
		 	System.out.println(new StringBuffer(String.valueOf(num3)).reverse());
	}

}
