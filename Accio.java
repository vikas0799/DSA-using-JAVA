/**
 * Main class of the Java program. 
 * 
 */
import java.util.*;

public class Accio {

    public static void main(String[] args) {
        //your code here.
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        
        // declare and intiz
        int arr[] = new int [N];
        
        // take inputs
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int flag,j;
        for(int i=0; i<N ; i++)
       {    flag=0;
           for(j=i+1;j<N;j++)
           {
              if((arr[i]+arr[j])==T)
              {  System.out.println(i+" "+j);
              flag++;break;  }
           } 
           if(flag==1)
           break;
        }
        
    }
}
