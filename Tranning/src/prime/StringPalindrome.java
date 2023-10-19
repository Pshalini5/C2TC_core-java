package prime;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		
		 String original, reverse = ""; // Objects of String class  
	      Scanner s=new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      original = s.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original. equals(reverse))  
	         System.out.println("string is a palindrome.");  
	      else  
	         System.out.println("string isn't a palindrome.");   
	   }   


	}
