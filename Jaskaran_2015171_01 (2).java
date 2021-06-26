/* Name - Jaskaran Singh
 Date - 23/02/2021     
 Statement - Printing an array into Zigzag fashion.
*/    
import java.util.Arrays;
import java.util.Scanner;
public class Jaskaran_2015171_01 {
	
	public static void main(String[] args)
	{
	int n,temp,i;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter no of elements in array");
	n = sc.nextInt();
	int arr[] = new int[n];
	
	System.out.println(" enter elements of the array:");
	for(i = 0; i < n; i++)
	{
	arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	for( i=1;i<n-1;i=i+2)
	{
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
	System.out.println("Converted array is :  ");
	for(i=0;i<n;i++)
		System.out.print(arr[i]+" ");

  }
}