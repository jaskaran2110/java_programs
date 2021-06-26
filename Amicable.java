/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-

Write a Program to find if the given numbers are Friendly pair or not (Amicable
or not). Friendly Pair are two or more numbers with a common abundance.
 Input & Output format:
 Input consists of 2 integers.
 The first integer corresponds to number 1 and the second integer
corresponds to number 2.
 If it is a Friendly Pair display Friendly Pair or displays Not Friendly
Pair.
 For example,6 and 28 are Friendly Pair.
 (Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.
 */



import java.util.*;
public class Amicable
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter two Numbers :");
        n1=s.nextInt();
        n2=s.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                sum1+=i;
            }
        }
        for(int i=1;i<n2;i++)
        {
            if(n2%i==0)
            {
                sum2+=i;
            }
        }
        if(sum1==n2&&sum2==n1)
        {
            System.out.println("Yess!! Given Numbers are Amicable");
        }
        else
        {
            System.out.println("No!! Given Numbers are not Amicable");
        }
    }
}