import java.util.Scanner;
class Quadratic
{
public static void main(String ar[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Pannaga R.Bhat");
System.out.println("1BM22CS189");
System.out.println("Enter values of a,b,c");
double a,b,c;
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
double r1, r2;
if (a==0)
{
System.out.println("Roots cannot be formed");
System.exit(0);
}

else
{
double d=(b*b)-(4*a*c);
if(d==0)
{
r1 = (-b)/(2*a);
System.out.println("Roots are real and equal");
System.out.println("Root1=Root2="+r1);
}
else if(d>0)
{
r1 = (-b + (Math.sqrt(d))) / (2*a);
r2 = (-b - (Math.sqrt(d))) / (2*a);
System.out.println("Roots are real and distinct");
System.out.println("Root1="+r1);
System.out.println("Root2="+r2);
}

else
System.out.println("Roots are imaginary");
}
}
}
