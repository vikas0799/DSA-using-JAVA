import java.util.*;
import java.io.*;
 class Node
 {
     int data;
     Node next;
 }


public class Linkedlist
{
    public static void main(String[] args) 
    {
        Node head=new Node();
        head.data=0;
        head.next=null;
        Scanner sc=new Scanner(System.in);


     for(int i=1;i<=10;i++)
     {
        Node temp=new Node();
        temp.data=i;
        temp.next=null;
         
        Node n=new Node();
           n=head;//cloning of head and traversing
        while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        n.next=temp;
        System.out.println("bhosdike");
     }
        
       
    
    }
}
