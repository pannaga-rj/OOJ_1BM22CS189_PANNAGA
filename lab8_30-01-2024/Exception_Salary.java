import java.util.Scanner;
class WrongSal extends Exception
{
	WrongSal(String s)
	{
		super(s);
	}
}

class Input
{
	Scanner sc = new Scanner(System.in);
	public int a()
	{	
		return sc.nextInt(); 
	}
}

class ManSal extends Input
{
	int msal;
	ManSal() throws WrongSal
	{
	System.out.println("Enter Manager's salary");
	msal = a();
	
	if(msal < 0)
		throw new WrongSal("Manager's salary cannot be zero");
	}
}

class EmpSal extends ManSal
{
	int esal;
	EmpSal() throws WrongSal
	{
	super();
	System.out.println("Enter Employee's Salary");	
	esal = a();
	
	if(esal < 0)
		throw new WrongSal("Employee's salary cannot be negative");
	else if(esal > msal)
		throw new WrongSal("Employee salary cannot be greater than Manager's Salary");
	}

	void disp_sal()
	{
		System.out.println("Manager's Salary = "+super.msal);
		System.out.println("Employee's Salary = "+esal); 
	}
}

public class ExpSal
{
	public static void main(String as[])
	{
		try
		{		
			EmpSal ob = new EmpSal();
			ob.disp_sal();
		}
		catch(WrongSal e)
		{
			// e.printStackTrace();
			System.out.println("Exception: "+e.getMessage());
		}
	}
}
		
		
