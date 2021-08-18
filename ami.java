import java.io.*;
import java.util.*;
import java.util.Arrays; 
import java.util.List; 

class ami{
           public static void main(String[]args)
           {
            List<Integer> A = Arrays.asList(10,2,3,4,5,7,8); int k=23;

        int csum=A.get(0),flag=0,sum=k; 
        HashSet<Integer> hs=new HashSet<Integer>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<7;i++)
        {
            csum=csum+A.get(i);
            if(hs.contains(csum-sum))
            {
               if(i>=3)
                { b.add(A.get(i)); 
                b.add(A.get(i-1));
                b.add(A.get(i-2));
                b.add(A.get(i-3)); 
                }
                Collections.sort(b);
            }
            else
            hs.add(csum);
        }
      
        System.out.println("why not working");
    
       for(int i=0;i<b.size();i++)
         System.out.println(b.get(i));
    }
}


