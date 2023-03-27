package progs;

public class StrPalindrome {

	
		 public static void main(String[] args) {  
		        String text = "Kayak";  
		        boolean flag = true;  
		          
		         
		        text = text.toLowerCase();  
		        int strLen =   text.length();
		        
		        for(int i = 0; i < strLen/2; i++){  
		            if(text.charAt(i) != text.charAt(strLen-i-1)){  
		                flag = false;  
		                break;  
		            }  
		        }  
		        if(flag)  
		            System.out.println(text+" Given string is palindrome");  
		        else  
		            System.out.println(text +" Given string is not a palindrome");  
		    }  
	}


