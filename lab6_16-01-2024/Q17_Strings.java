
import java.util.Scanner;
class str1
{
    int reg[] = new int[5];
    String fn[] = new String[5];
    short sem[] = new short[5];
    float cgpa[] = new float[5];
    Scanner sc = new Scanner(System.in);
    str1()
    {
        for(int i=0;i<5;i++)
        {   
            System.out.println("Enter Student "+(i+1)+" Details");
            System.out.println("Enter your register number");
            reg[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your full name");
            fn[i] = sc.nextLine();
            System.out.println("Enter your semester");
            sem[i] = sc.nextShort();
            System.out.println("Enter your cgpa");
            cgpa[i] = sc.nextFloat();
        }
    }
    
    void display()
    {
        for(int i=0;i<5;i++)
        {   
            System.out.println();
            System.out.println("Student "+(i+1)+" Details:");
            System.out.println("Register number: "+reg[i]);
            System.out.println("Full name: "+fn[i]);            
            System.out.println("Semester: "+ sem[i]);
            System.out.println("CGPA: "+cgpa[i]);
            System.out.println();
        }
    }
    
    void sort_cgpa()
    {
        for(int j = 0;j<cgpa.length;j++)
        {
            for(int i=0;i<cgpa.length-1;i++)
            {
                if(cgpa[i] > cgpa[i+1])
                {
                    float temp = cgpa[i+1];
                    cgpa[i+1] = cgpa[i];
                    cgpa[i] = temp;
                }

            }
        }
        System.out.println("CGPA After Sorting");
        for(int i=0;i<cgpa.length;i++)
        {
            System.out.println(cgpa[i]);
        }
    }
    
    void sort_names()
    {
        for(int j = 0;j<fn.length;j++)
        {
            for(int i=0;i<fn.length-1;i++)
            {
                if(fn[i].compareTo(fn[i+1])>0)
                {
                    String temp = fn[i+1];
                    fn[i+1] = fn[i];
                    fn[i] = temp;
                }

            }
        }
        
        System.out.println("Names After Sorting");
        for(int i=0;i<fn.length;i++)
        {
            System.out.println(fn[i]);
        }
    } 
    
    public static void main(String ar[])
    {
        System.out.println("Enter student details");
        str1 ob = new str1();
        ob.display();
        ob.sort_cgpa();
        ob.sort_names();
    }
    
}


/*

 */
      
