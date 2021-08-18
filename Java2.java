import java.util.*;
class Java2 {
    public static void main(String args[] ) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int n=sc.nextInt();
            int d=sc.nextInt();
            int a[]=new int[n];
            
            for(int i=0;i<n;i++)
               a[i]=sc.nextInt();
               Arrays.sort(a);

            TreeSet<Integer>hs=new TreeSet<>();
            while(d<=a[n-1])
            {
                hs.add(d);
                d=d+10;
            }
            hs.add(0);
           
            
           int key=0,count=0;
           for(int i=0;i<n;i++)
           {    count=0;Iterator<Integer> j=hs.iterator(); key=0; 
             while( j.hasNext())  
             {  
                key=a[i]-j.next();
               if(hs.contains(key))
               {count++;break;}
             }
             if(count>0)
             System.out.println("YES");
             else
             System.out.println("NO");

           }  

        }
}
}
