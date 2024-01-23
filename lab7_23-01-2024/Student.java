package CIE;
import java.util.Scanner;
public class Student
{
	protected String usn,name;
	protected int sem;
	public void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your usn: ");
		usn = sc.nextLine();
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your semester: ");
		sem = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("USN:  " +usn);
		System.out.println("NAME:  " +name);
		System.out.println("SEMESTER:  " +sem);
	}
}
		
		
