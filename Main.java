import java.util.*;
class Main
{
    public static void main(String []ars)
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String p=sc.nextLine();
  
      String s=p+str;
      for(int i=p.length();i<=s.length()-p.length();i++)
      {     int j=0;
          if(s.charAt(0)==s.charAt(i))
          {
              for( j=0;j<p.length();j++)
              {  if(s.charAt(j)!=s.charAt(i+j))
                  break; }
          }
          if(j==p.length())
             { System.out.println("Yes");break; }
  
          if(i==(s.length()-p.length())&&j!=p.length())
             System.out.println("No");
     }   
    }

}