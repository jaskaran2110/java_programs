/*
Jaskaran Singh
Section - DS
Roll No. : 2015171
Program Statement :-
Write a program to find all the patterns of 0(1+)0 in the given string. Given a
string containing 0's and 1's, find the total number of 0(1+)0 patterns in the
string and output it.
 0(1+)0 - There should be at least one '1' between the two 0's.
 For example, consider the following string.
 Input: 01101111010
 Output: 3
 */



import java.util.*;
public class pattern
{
	public static int duplicate(int arr[],int n)
	{
		if(n==0||n==1)
		{
			return n;
		}

		int k=0;
		int temp[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
				if(arr[i]!=arr[i+1])
				{
					temp[k++]=arr[i];
				}
				
		}
		temp[k++]=arr[n-1];
		for(int i=0;i<k;i++)
		{
			arr[i]=temp[i];
		}
		return k;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,count=0;
		int l;
		System.out.println("Enter Size of array :");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		l=duplicate(arr,n);
		for(int i=0;i<l;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
	System.out.println("Number of Times 0(1+)0 Pattern Encounters: "+(count-1));
		sc.close();
	}

}