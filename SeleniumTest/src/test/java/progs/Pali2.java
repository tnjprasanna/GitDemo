package progs;

public class Pali2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int reminder,sum=0,temp;    
		  int num=121;//It is the number variable to be checked for palindrome  
		  
		  temp=num;    
		  while(num>0){    
			  reminder=num%10;  //getting remainder  
		   sum=(sum*10)+reminder;    
		   num/=10;    
		  }   
		  
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	
	}


