package myfirst;

class Student {
	
	
	int rollNumber;
	String name;
	int marks;
}

public class MultipleDataTypeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.name="Akhil";
		s1.rollNumber=101;
		s1.marks=95;
		
		s2.name="Naga";
		s2.rollNumber=102;
		s2.marks=98;
		
		s3.name="Ramesh";
		s3.rollNumber=103;
		s3.marks=92;
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(Student stud: students) {
			System.out.println(stud.name+ ":"+ stud.marks);
		}
		

	}

}
