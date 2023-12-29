package demo.launch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Alpha2 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.age>o2.age)
			return 1;
		else 
			return -1;
	}
	
}

class Employee{
	int empId;
	String name;
	int age;
	
	
	public Employee(int empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}
	
}


public class LaunchCollectionLamdaExpression {

	public static void main(String[] args) {
		Employee emp1=new Employee(25, "Akhil", 23);
		Employee emp2=new Employee(18, "Nikhil", 16);
		Employee emp3=new Employee(16, "Suresh", 32);
		

		ArrayList<Employee> empList=new ArrayList();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.print("Before Sorting "+empList);
		
//		Alpha2 alp=new Alpha2();
		Comparator<Employee> sorting = new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.age>o2.age)
				return 1;
				else 
				return -1;
			}
			
		};
		
		Comparator<Employee> sortingByLamda = (Employee o1, Employee o2)-> {
			if(o1.age>o2.age)
			return 1;
			else
			return -1;
		};
	
		
		Collections.sort(empList, sortingByLamda);
		System.out.println();
		System.out.print("After Sorting "+empList);

	}

}
