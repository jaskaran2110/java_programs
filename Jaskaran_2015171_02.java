/* Name - Jaskaran Singh
 Date - 23/02/2021     
 Statement - Rearrange positive and negative numbers in an array. 
*/    
import java.util.Scanner;
public class Jaskaran_2015171_02 {
	
	public static void main(String[] args)
	{
	int n, max;
	Scanner sc = new Scanner(System.in);
	System.out.print("enter no of elements in array");
	n = sc.nextInt();
	int arr[] = new int[n];
	
	System.out.println(" enter elements of the array:");
	for(int i = 0; i < n; i++)
	{
	arr[i] = sc.nextInt();
	}
	int key, j;
    for (int i = 1; i < n; i++) {
        key = arr[i];
       
        if (key > 0)
            continue;

               j = i - 1;
        while (j >= 0 && arr[j] > 0) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = key;
	}
    
    System.out.print("Converted String is");
    for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    
}
}