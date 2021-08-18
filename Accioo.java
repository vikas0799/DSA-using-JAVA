import java.io.*;
import java.util.*;
import java.math.*;

class Accioo
{
    public static void main(String[]args) 
    {
       
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();  int j,i;String temp=""; String a[]=new String[n];
     for(i=0;i<n;i++)
     a[i]=sc.nextLine();

   
   for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
        if(a[i][0]>a[j][0])
        {  temp=a[i][0];
           a[i][0]=a[j][0];
           a[j][0]=temp;
        }
    }
    for(i=0;i<n;i++)
    System.out.println(a[i]);
  }
}