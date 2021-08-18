import java.util.*;
public class Vikass {
    public static void main(String args[]) 
    {   //nextLine method is used for taking string sentence with space:
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();//indexing 
        String s2=sc.nextLine();//gives sum
        String s3=sc.nextLine();//main given string
        String amit="";

        for(int i=0;i<s3.length();i++)
        {     
            if(65<=(int)s3.charAt(i)&&(int)s3.charAt(i)<=90)
            {
                for(int j=0;j<s1.length();j++)
                {
                    if(s1.charAt(j)==(char)s3.charAt(i)+32)
                    {
                    amit=amit+(char)(s2.charAt(j)-32);break;}
                }
            }
            if((int)s3.charAt(i)>=97&&(int)s3.charAt(i)<=122)
            {
               char c=s3.charAt(i);
               for(int j=0;j<s1.length();j++)
                {
                    if(c==s1.charAt(j))
                      amit=amit+s2.charAt(j);
                }
            }
             
            if((int)s3.charAt(i)>=48&&(int)s3.charAt(i)<=57)
             amit=amit+s3.charAt(i);
             
        }
        System.out.println(amit);
    }
}
