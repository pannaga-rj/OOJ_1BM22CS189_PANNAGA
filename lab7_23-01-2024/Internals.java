package CIE;
import java.util.Scanner;
public class Internals extends Student
{	
	Scanner sc = new Scanner(System.in);
	public int m[] = new int[5];
	public void accept_imarks()
	{
		System.out.println("Enter internal marks of 5 subjects");
		for(int i=0; i<5; i++)
		{	
			m[i] = sc.nextInt();
		}
	}
}
			
