/*Jaskaran Singh
Section - DS
Roll No. : 2015171
*/
import java.io.*;
import java.util.*;

public class sumarray{

public static void main(String[] args) throws Exception {
    int n;
    Scanner s=new Scanner (System.in);
    n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    int n1;
    n1=s.nextInt();
    int b[]=new int [n1];
    for(int i=0;i<n1;i++)
    {
        b[i]=s.nextInt();
    }
    
    if(n>n1)
    {
        int c[]=new int [n];
        int c1=0;
        int ans=0;
        for(int i=n,j=n1,k=n;k>0;i--,j--,k--)
        {
            ans=c1;
          if(i>=0)
          {
              ans+=a[i];
          }
          if(j>=0)
          {
              ans+=b[j];
          }
           int r=ans%10;
           c1=ans/10;
           c[i]=r;
          
        }
         if(c1!=0)
        {
             System.out.println(c1);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
        
    }
    else
    {
        
        int c[]=new int [n1];
        int c1=0;
        int ans=0;
        for(int i=n,j=n1,k=n1;k>0;i--,j--,k--)
        {
            ans=c1;
          if(i>=0)
          {
              ans+=a[i];
          }
          if(j>=0)
          {
              ans+=b[j];
          }
           int r=ans%10;
           c1=ans/10;
           c[i]=r;
          
        }
         if(c1!=0)
        {
             System.out.println(c1);
        }
        for(int i=0;i<n1;i++)
        {
            System.out.println(c[i]);
        }
        
    }
 }

}