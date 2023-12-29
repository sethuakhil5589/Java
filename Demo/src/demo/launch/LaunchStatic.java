package demo.launch;

class Demo{

static int age, marks;

static {
	System.out.println("In static block");
}

static void demo() {
	age=10;
	marks=100;
	System.out.println("In static method");
	
}

{
	System.out.println("In java initialization block");
}

public Demo() {
	System.out.println("In constructor");
}

void demo1() {
	System.out.println("In a method");
}

}

public class LaunchStatic {

	public static void main(String[] args) {
//		Demo.demo();
//		Demo d=new Demo();
//		d.demo1();

	}

}
