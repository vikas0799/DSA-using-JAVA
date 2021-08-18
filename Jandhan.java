       class   Jandhan
{
  int accno ,bal;char customer[];

  public Jandhan(int ac,char arr[])    //constructure for memory initialised
  { bal=15000;accno=ac; customer[]=arr[]; }

  public void deposite(int amt)
  {bal=bal+amt;  }

  public void withdrow(int amt)
  {  bal=bal-amt;}

  public void showbal()
  {  System.out.println("aviable balance is = "+bal);}
 
  public static void main(String[] asdf)
  {
  Jandhan r=new Jandhan(100,"vikas");
       r.deposite(5000);
       r.withdrow(1000);
       r.showbal();
   }
																					
}