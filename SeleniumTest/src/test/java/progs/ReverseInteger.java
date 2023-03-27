package progs;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 102;
		int multi=0;
		int rev = 0;
		
		while(num!=0) {
			
			multi = rev *=10;
			rev = multi + num%10; // "%" reminder
			num /= 10; //Quotient 
			
		}
		System.out.println(rev);
		

	}

}
