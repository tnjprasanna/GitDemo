package progs;

public class PrimeNum {
	
	/*
	Do not change the class and method name of this code.
	Do not use TabKey.
	Write your logic after the comment - write your code here
	*/
		public static boolean isPrime(int num) {

			// Write your code here		
	      int m =0, flag =0;
	      m=num/2;
	      if(num == 0 || num == 1){
	    	  System.out.println("its not a prime");
	    	  return false;
	 	 
	      } else {
	        
	        for(int i=2;i<=m;i++){
	          if(num%i ==0){
	        	  flag=1;
	        	  break;
	          	}
	        }
	        
	        if(flag==0) {
	        	System.out.println("its a prime");
	    	  return true;
	        } else {
	        	System.out.println("its not a prime");
				return false;
	        }
	        
	      }
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 isPrime(19);
	}

}
