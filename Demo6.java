import java.util.*;
class Demo6
{
  int r;double A,C;
 void area()
{
A=3.14*r*r;
System.out.println("area is= "+A);
}
  
void circum()
{
C=2*3.14*r;
System.out.println("circumference is = "+C);
}


public static void main(String[] asdf)
{
Demo6 t=new Demo6();
t.r=10;
t.area();
t.circum();
}
}