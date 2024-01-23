package SEE;

import CIE.Internals;
import java.util.Scanner;
public class External extends Internals
{	
	protected int sm[] = new int[5];
	protected int fm[] = new int[5];
	public void accept_smarks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Semester marks of 5 subjects");
		for(int i=0; i<5; i++)
		{	
			sm[i] = sc.nextInt();
		}
	}
	
	public void calfm()
	{
		for(int i = 0;i<5;i++)
		{
			fm[i] = (sm[i]/2) + super.m[i];
		}
	}
	public void displayfm()
	{
		display();
		for(int i = 0;i<5;i++)
		{
			System.out.println("Subject " +(i+1)+ " marks:"+ fm[i]);	
		}
	}
}
