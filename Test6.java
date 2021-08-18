import java.util.*;
class Test6
{
  public static void main(String[ ]args)
{
   int m,n,i,j;
   Scanner sc = new Scanner(System.in);
   m=sc.nextInt();
   n=sc.nextInt();
   int a[ ][ ]=new int[m][n];
   for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
       {
         a[i][j]=sc.nextInt();
       }
  }
   for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
       {   int k;
            if (a[i][j]%2!=0)
             { for(k=0;k<n;k++)
                 a[i][k]=1;  }
            else
              {  for(k=0;k<n;k++)
                 a[i][k]=0;  }
         
       }
  }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
       {
         System.out.print(a[i][j]);
           System.out.print(" ");
       }
     
         System.out.println(" ");
  }
}
}