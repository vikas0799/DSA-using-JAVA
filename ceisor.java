import java.util.Scanner;
public class Ceisor {
   public static void main(String args[]) 
   {
       Scanner     s = new Scanner(System.in);
       String a = s.nextLine();

        int n=a.length(); int key=s.nextInt();

     for(int i=0;i<n;i++)
     {  
       
               //small letter coding
         if(a.charAt(i)>=97&&a.charAt(i)<=122)
         {

           if(a.charAt(i)<=(122-key))
             System.out.print((char)(a.charAt(i)+key)); 

           else

            System.out.print((char)(a.charAt(i)-(26-key)));
         }
         


         //big letter coding


         else
          {
            if(a.charAt(i)<=(90-key))
             {

              if(a.charAt(i)==' ')
              System.out.print(" ");

              else
              System.out.print((char)(a.charAt(i)+key)); 
            }

           else
             System.out.print((char)(a.charAt(i)-(26-key)));
          }

        }
      }
}