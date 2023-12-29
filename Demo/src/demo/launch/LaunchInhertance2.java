package demo.launch;

class Animal{
	int age;
	
	Animal(){//super
		
		System.out.println("In zero parameterzied constructor");
	}
	Animal(int age){
		this.age=age;
		System.out.println("In one parameterized constructor");
	}
}

class Lion extends Animal{
	int noOfLegs;
	
	Lion(){//super
		super(2);
		System.out.println("In zero parametrized constructor");
	}
	Lion (int noOfLegs){//super
		this();
		this.noOfLegs=noOfLegs;
		System.out.println("In single parametrized constructor");
	}
	void disp() {
		System.out.println("no of legs: " + noOfLegs);
		System.out.println("age: " + age);
	}
}

public class LaunchInhertance2 {

	public static void main(String[] args) {
		Lion lion=new Lion(4);
		lion.disp();
		

	}

}
