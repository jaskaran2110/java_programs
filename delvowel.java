/*
Jaskaran Singh
Section - DS
Roll No. : 2015171
//Program Statement :-

Write a java program to delete vowels from given string using StringBuffer class.
*/

import java.util.*;
public class delvowel
{
    public static void main(String []args) 
    {
        String S1;
        System.out.println("Enter a string:");
        Scanner s=new Scanner(System.in);
      S1=s.nextLine();
      StringBuffer sub=new StringBuffer(S1);
      for(int i=0;i<sub.length();i++)
      {
        if(sub.charAt(i)=='a'||sub.charAt(i)=='A'||sub.charAt(i)=='e'||sub.charAt(i)=='E'||sub.charAt(i)=='i'||sub.charAt(i)=='I'||sub.charAt(i)=='o'||sub.charAt(i)=='O'||sub.charAt(i)=='u'||sub.charAt(i)=='U')
        {
          sub.replace(i,i+1,"");
        }
      }
      System.out.println(sub);
      s.close();
    }
}

// OUTPUT:-