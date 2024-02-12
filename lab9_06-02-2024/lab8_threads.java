class A1 extends Thread
{
  public void run()
  {
    try
    {
      int i= 0;
      while(i<20)
      {
        System.out.println("BMS College of Engineering");
        Thread.sleep(2000);
        i++;
      }
    }
    catch(Exception e)
    {
        System.out.println("Exception occured");
    }
  }
}
  
  
class A2 implements Runnable
{
  public void run()
  {
    try
    {
      int i= 0;
      while(i<20)
      {
      System.out.println("CSE");
      Thread.sleep(1000);
      i++;
      }
    }
    
    catch(Exception e)
    {
      System.out.println("Exception caught");
    }
  }
}
  
class Lab8
{
  public static void main(String arg[])
  {
    A1 ob1 = new A1();
    Runnable r = new A2();
    Thread ob2 = new Thread(r);
  
    ob1.start();
    ob2.start();
  }
}
