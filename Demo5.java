import java.util.*;
class Demo5
{
 int k, a,b,c;
void add()
{  c=a+b;  
 System.out.println("Addition is ="+c);
}
void mult()
{
k=a*b;
System.out.println("multiplication is ="+k);
}


public static void main(String[] asd)
{
  Demo5 t=new Demo5();
t.a=5;
t.b=10;
t.add();
t.mult();
}
}