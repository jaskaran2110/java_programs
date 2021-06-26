/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-

. Write a Program to print an array into Zigzag fashion. Suppose you were given
an array of integers, and you are told to sort the integers in a zigzag pattern. In 
general, in a zigzag pattern, the first integer is less than the second integer,
which is greater than the third integer, which is less than the fourth integer, and
so on. Hence, the converted array should be in the form of e1 < e2 > e3 < e4 >
e5 < e6.

*/


import java.util.*;
public class zigzag
{
    public static void main(String []args) 
    {
        int n;
        System.out.println("Enter size of array");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<=n/2;i++)
        {
            if(flag)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
                else
                {
                    if(arr[i]<arr[i+1])
                    {
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            flag=!flag;
        }
        System.out.print("\n");
        System.out.println("Array after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        
    }
}