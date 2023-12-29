package demo.launch;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>{
	int empId;
	String name;
	int age;
	
	
	public Employee1(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Employee1 o) {
		if(this.age>o.age)
		return 1;
		else
		return-1;
	}
	
}

public class LaunchCollectionComaprable {

	public static void main(String[] args) {
		Employee1 emp1=new Employee1(25, "Akhil", 23);
		Employee1 emp2=new Employee1(18, "Nikhil", 16);
		Employee1 emp3=new Employee1(16, "Suresh", 32);
		

		ArrayList<Employee1> empList=new ArrayList();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.print("Before Sorting : "+empList);
		
		Collections.sort(empList);
		System.out.println();
		
		System.out.print("After Sorting: "+empList);
	}

}
