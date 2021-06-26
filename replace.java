/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-
2. Write a Program to replace all 0's with 1 in a given integer. Given an integer as
an input, all the 0's in the number has to be replaced with 1.
 For example, consider the following number
 Input: 102405
 Output: 112415
 Input: 56004
 Output: 56114
 */



import java.util.*;
public class replace
{
    public static void main(String []args) 
    {
        int n;
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int tn=n;
        int result=0;
        int decimal=1;
        System.out.println("Number before replacing :"+n);
        if(n==0)
        {
            result+=(1*decimal);
        }
        while(n>0)
        {
            if(n%10==0)
            {
                result+=(1*decimal);
                n/=10;
                decimal*=10;
            }
            else
           {
                n/=10;
                decimal*=10;
           }

        }
        tn+=result;
        System.out.println("After replacing all zeros with one :"+tn);
        s.close();
    }
}