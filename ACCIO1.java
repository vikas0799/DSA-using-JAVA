import java.util.*;
import java.lang.*;
import java.io.*;

class ACCIO1 {
	public static void main (String[] args) {
	            //your code here
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t>0)
                {  t--;
                 int n=sc.nextInt();
                int x=sc.nextInt();
                 int a[]=new int[n];
                 for(int i=0;i<n;i++)
                  a[i]=sc.nextInt();
                  int i=lower_bound(a,a+n,x);
        
    
    System.out.println(i); 
                }
	}	
}