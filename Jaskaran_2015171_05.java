/* Name - Jaskaran Singh
 Date - 23/02/2021     
 Statement - Write a java program to delete vowels from given string using StringBuffer class
 */    
import java.util.Scanner;
import java.util.Arrays; 
import java.util.List; 
public class Jaskaran_2015171_05 {
	  public static void main(String[] args) {

		  Scanner sc= new Scanner(System.in); 
	      System.out.print("enter the string");  
	      String s= sc.nextLine();  
	      
	      Character[] chVowels = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
	      List<Character> vow = Arrays.asList(chVowels);
	      StringBuffer sb = new StringBuffer(s);
	      for(int a = 0; a < sb.length(); a++)
	      {
	         if(vow.contains(sb.charAt(a)))
	         {
	            sb.replace(a, a + 1, "");
	            a--;
	         }
	      }
	      System.out.println(sb);

	      
	  }
}