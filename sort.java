/*
Jaskaran Singh
Section - DS
Roll No. : 2015171
Write a Program to rearrange positive and negative numbers in an array .
 This approach moves all negative numbers to the beginning and positive
numbers to the end of the array.
*/


import java.util.*;
public class sort
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int j=0;
        System.out.println("Enter Size of Array :");
        n=sc.nextInt();
        int arr[]=new int[n];
     
        System.out.println("Enter Elements of Array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
         
            if(arr[i]<0)
            {
                if(j!=i)
               {

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
               j++;
            }
            
        }
        System.out.print("\n");
        System.out.println("Array after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}