import java.util.*;
import java.lang.*;
import java.io.*;

class  G {
	public static void main (String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t>0)
                { 
					 t--;
					String s=sc.next();
		HashMap<Character, Integer> d = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < s.length(); i++)
		{
			if(d.containsKey(s.charAt(i)))
				d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
			else
				d.put(s.charAt(i), 1);
		}
		for(int i = 0; i < s.length(); i++)
		{
			if(d.get(s.charAt(i)) != 0)
			{
				System.out.print(s.charAt(i));
				System.out.print(d.get(s.charAt(i)) + " ");
				d.put(s.charAt(i), 0);
			}		
}}}}