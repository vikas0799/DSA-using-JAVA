import java.util.*;
import java.math.*;
import java.io.*;
class Demo
{
public static void main(String[] ar)
{
  Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();
  int i,j;int a[][]=new int[n][n];
  for(i=0;i<n;i++)
   for(j=0;j<n;j++)
      a[i][j]=sc.nextInt();
  int b[]=new int[n+n];
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
           if(i==j)   
             b[i]=a[i][j];
       }
      int k=n;
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
         
          if(i+j==n-1)
           { b[k]=a[i][j];  k++;}
        }
  Arrays.sort(b);
  int s=b[0];
  for(i=0;i<2*n-1;i++)
 if(b[i]!=b[i+1])
  s=s*b[i+1];  
System.out.print(s);
}}