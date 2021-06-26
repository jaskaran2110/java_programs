/* Name - Jaskaran Singh
 Date - 23/02/2021     
 Statement - Program to find all the patterns of 0(1+)0 in the given string.
 */    
import java.util.Scanner;
public class Jaskaran_2015171_04 {
	  public static void main(String[] args) {

		  Scanner sc= new Scanner(System.in); 
	      System.out.print("enter the string");  
	      String s= sc.nextLine();  
	      
	      char last = s.charAt(0); 
	      int i = 1, c = 0; 
	      while (i < s.length()) 
	      { 
	           
	         if (s.charAt(i) == '0' && last == '1') 
	         { 
	            while (s.charAt(i) == '0') 
	                 i++; 
	      
	                
	            if (s.charAt(i) == '1') 
	                 c++; 
	          } 
	      
	            last = s.charAt(i); 
	            i++; 
	        } 
	      System.out.print("Number of patterns : " + c );


	  }
}