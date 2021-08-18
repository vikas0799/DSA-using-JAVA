import java.util.*;
class Lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  boolean isOn;

  // method to turn on the light
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);

  }

  // method to turnoff the light
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}
//yha se start hota hai class of main function
class Demo4
{ 
  int a,b,c;
void add()
{
  c=a+b;
  System.out.println("addition is="+c);
}
public static int SqureFun(int n)
{
  System.out.println(n);
  return n*n;
}
public static void main(String[] asd)//main function
{
  
  Lamp tesla=new Lamp();4
  tesla.turnOff();

  Demo4 t=new Demo4();
    t.a=90;
    t.b=70;
    t.add();

    String s=new String();//standered class object s
    
    Demo4 obj2=new Demo4();
        int k=obj2.SqureFun(10);
        System.out.println("squre is "+k);
 }
}