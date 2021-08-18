import java.util.*;
public class Map 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
       
        HashMap<Integer,String>pa=new HashMap<>();
         
         pa.put(56,"vikas");
         pa.put(38,"punit");
         pa.put(76, "vishaljotwani");
         System.out.println(pa.size());

         

int j=0;
for (int i: pa.keySet())
{       s[j]=i;j++;
String lastname=pa.get(i);   
System.out.println(i +" "+ lastname);   
}   
for(int i=0;i<n;i++)
System.out.println(s[i]);
   
    }    
}
