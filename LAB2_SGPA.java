import java.util.Scanner;
class SUBJECT{
	int subjectmarks;
	int credits;
	int grade;
}

class SGPA{
	// Array of objects
	SUBJECT subject[];
	String name, usn;
	double sgpa;
	Scanner s = new Scanner(System.in);
	SGPA(){
		subject = new SUBJECT[8];
		for(int i=0;i<8;i++)
			subject[i] = new SUBJECT();
	}

	void getStudentDetails(){
		System.out.println("Enter the name of the student");
		name = s.nextLine();
		System.out.println("Enter the usn of the student");
		usn = s.next();
	}
	void getMarks(){
		for(int i=0;i<8;i++){
			
			System.out.println("Enter subject "+(i+1)+" marks");
			subject[i].subjectmarks = s.nextInt();
			
			System.out.print("Enter credits of subject "+(i+1));
			subject[i].credits = s.nextInt();
		}
		for(int i=0;i<8;i++){
		
			if(subject[i].subjectmarks>=90 && subject[i].subjectmarks<=100)
				subject[i].grade = 10;
			else if(subject[i].subjectmarks>=80 && subject[i].subjectmarks<90)
				subject[i].grade = 9;
			else if(subject[i].subjectmarks>=70 && subject[i].subjectmarks<80)
				subject[i].grade = 8;
			else if(subject[i].subjectmarks>=60 && subject[i].subjectmarks<70)
				subject[i].grade = 7;
			else if(subject[i].subjectmarks>=50 && subject[i].subjectmarks<60)
				subject[i].grade = 6;
			else if(subject[i].subjectmarks>=40 && subject[i].subjectmarks<50)
				subject[i].grade = 5;
			else if(subject[i].subjectmarks>=0 && subject[i].subjectmarks<40)
				subject[i].grade = 0;
			else{
			System.out.println("Enter the valid marks");
			break;
			}
		}
	}
	double computeSGPA(){
		double sum = 0.0, num;
		for(int i=0;i<8;i++){
			num = subject[i].grade * subject[i].credits;
			sum += num;
		}
		sgpa = sum/20;
		return sgpa;
	}
	
	void display(double sgpa){
		System.out.println("Student's name is "+name);
		System.out.println("Student's usn is "+usn);
		System.out.println("Student's SGPA is "+sgpa);
	}
}
class A{
	public static void main(String ar[]){
		SGPA ob = new SGPA();
		ob.getStudentDetails();
		ob.getMarks();
		double c = ob.computeSGPA();
		ob.display(c);
	}
}