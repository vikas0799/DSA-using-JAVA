//String,System
import java.util.*;
class Java1
           { public static void main(String args[]) 
            {               
	Scanner sc=new Scanner(System.in);
	int d1=sc.nextInt();
	int v1=sc.nextInt();
	int d2=sc.nextInt();
	int v2=sc.nextInt();
	int p=sc.nextInt();
	int count=0,i=1;
	if(d1>=d2)
	{
	    count=d2-1;
	while(p>0&&i<=(d1-d2))
	{
	    p=p-v2;
	    count++;
	    i++;
	}
	}
	else{
	count=d1-1;
		while(p>0&&i<=(d2-d1)){
	    p=p-v1;
	    count++;
	    i++;
		}
	}
	 if(p%(v1+v2)==0)
	 count=count+p/(v1+v2);
	 else
	 count=count+p/(v1+v2)+1;
	 
	 System.out.print(count);
	
	}
}
              
           