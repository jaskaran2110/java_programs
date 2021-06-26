/* Name - Jaskaran Singh
 Date - 23/02/2021     
 Statement -  Program to find the saddle point coordinates in a given matrix
 */    
import java.util.Scanner; 
public class Jaskaran_2015171_03 {
	 
		 public static void main(String args[])
		 {
		 Scanner sc = new Scanner(System.in);
		 int i,j,n;
		 System.out.println("enter the number of rows and columns");
		 n = sc.nextInt();
		 
		 int[][] mat = new int[n][n];
		 
		     System.out.println("enter the elements of the matrix") ;
		     for(i=0;i<n;i++)
		     { 
		      for(j=0;j<n;j++)
		      { 
		          mat[i][j] = sc.nextInt();
		     }
		 }
		 
		     System.out.println("the elements of the matrix") ;
		     for(i=0;i<n;i++)
		     { 
		      for(j=0;j<n;j++)
		      { 
		        System.out.print(mat[i][j]+"\t");
		      }
		       System.out.println("");
		     }
		     int min =0, max = 0;
			 int [][]p = new int[2][2];

		     for (i = 0; i < n; i++)
				{
					min = mat[i][0];
					for (j = 0; j < n; j++)
						{
							if (min >= mat[i][j])
								{
									min = mat[i][j];
									p[0][0] = i;
									p[0][1] = j;
								}
						}
					j = p[0][1];
					max = mat[0][j];
					for (int k = 0; k < n; k++)
						{
							if (max <= mat[k][j])
								{
									max = mat[i][j];
									p[1][0] = k;
									p[1][1] = j;
								}
						}
				}
				if (min == max) 
				{
							
					System.out.print("Saddle point is "+ min );
	
				}
					
		 
		 } 
	

}
