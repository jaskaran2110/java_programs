/*
Jaskaran Singh
Section - DS
Roll No. : 2015171

Program Statement :-
Write a Program to find the saddle point coordinates in a given matrix. A saddle
point is an element of the matrix, which is the minimum element in its row and
the maximum in its column.
For example, consider the matrix given below
 Mat[3][3]
 1 2 3
 4 5 6
 7 8 9
Here, 7 is the saddle point because it is the minimum element in its row and
maximum element in its column.
*/



import java.util.*;
public class saddlepoint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=0,j=0,n=0,m=0,max=0,min=0,sp=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]= new int[n][m];
		System.out.println("Enter Elements: ");
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<m;j++)
			 {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<m;j++)
			 {
				 min=arr[i][0];
				 max=arr[0][j];
				 for(int k=0;k<m;k++)
				 {
					 if(arr[i][k]<min)
					 {
						 min=arr[i][k];
					 }
				 }
				 for(int l=0;l<n;l++)
				 {
					 if(arr[l][j]>max)
					 {
						 max=arr[l][j];
					 }
				 }
				 if(min==max)
				 {
					 sp=min;
					 System.out.println("Saddle point is:"+sp);
				 }
			 }
		 }
		 sc.close();
	}

}