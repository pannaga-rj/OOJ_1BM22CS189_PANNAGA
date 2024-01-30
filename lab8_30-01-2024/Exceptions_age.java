import java.util.Scanner;
class WrongAge extends Exception
{
	public WrongAge()
	{
		System.out.println("Wrong Age");
	}
	
	public WrongAge(String s)
	{
		super(s);
	}
	
}

 
class Father 
{	
	Scanner sc;
	int fage;
	Father() throws WrongAge
	{
	sc = new Scanner(System.in);
	System.out.println("Enter father's age");
	fage = sc.nextInt();
	
	if(fage < 0)
		throw new WrongAge("Age cannot be negative");
	}


	public void fdisplay()
	{
		System.out.println("Father's Age= "+fage);
	}
}

class Son extends Father
{
	int sage;
	Son() throws WrongAge
	{
	super();
	System.out.println("Enter Son's Age");
	sage = sc.nextInt();
	
	if(sage > fage)
		throw new WrongAge("Son's age cannot be greater than father's age");
	else if(sage < 0 )
		throw new WrongAge("Age cannot be negative");
	
	}
	public void display()
	{
		super.fdisplay();
		System.out.println("Son's Age= "+sage);
	}
}

class Main 
{
	public static void main(String a[]) throws Exception
	{
		
		try{
			Son s = new Son();
			s.display();
		}
		catch(WrongAge e)
		{	
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
