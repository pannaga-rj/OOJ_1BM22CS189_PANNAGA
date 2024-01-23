import CIE.Student;
import CIE.Internals;
import SEE.External;

public class Main
{
	public static void main(String ar[])
	{
		int n = 1;
		External ob[] = new External[n];
		
		for(int i = 0;i<n;i++)
		{
			ob[i] = new External();
			ob[i].input();
			System.out.println("Enter CIE Marks");
			ob[i].accept_imarks();
			System.out.println("Enter SEE Marks");
			ob[i].accept_smarks();
		}
	
		System.out.println("Displaying Data:");
		for(int i = 0;i<n;i++)
		{
			ob[i].calfm();
			ob[i].displayfm();
		}
	}
}
	
