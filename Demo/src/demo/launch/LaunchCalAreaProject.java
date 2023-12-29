package demo.launch;

import java.util.Scanner;

class Rectangle{
	float length;
	float breadth;
	float area;
	
	void input() {
		System.out.println("Calculating area of Rectangle");
		System.out.println("length of rectangle: ");
		Scanner scan=new Scanner(System.in);
		length=scan.nextFloat();
		
		System.out.println("breadth of rectangle: ");
		breadth=scan.nextFloat();

	}
	
	void compute() {
		area= length * breadth;
	}
	
	void disp() {
		System.out.println("Area of Rectangle : " + area);
	}
}

class Square{
	float length;
	float area;
	
	void input() {
		System.out.println("Calculating area of Square");
		System.out.println("length of Square: ");
		Scanner scan=new Scanner(System.in);
		length=scan.nextFloat();

	}
	
	void compute() {
		area= length * length;
	}
	
	void disp() {
		System.out.println("Area of Square : " + area);
	}
}

class Circle{
	float radius;
	
	float area;
	
	void input() {
		System.out.println("Calculating area of Circle");
		System.out.println("radius of Circle: ");
		Scanner scan=new Scanner(System.in);
		radius=scan.nextFloat();
		
		
	}
	
	void compute() {
		area= 3.14f * radius * radius;
	}
	
	void disp() {
		System.out.println("Area of Circle : " + area);
	}
}

public class LaunchCalAreaProject {

	public static void main(String[] args) {
		
		Rectangle re= new Rectangle();
		Square sq = new Square();
		Circle ci = new Circle();
		
		re.input();
		re.compute();
		re.disp();
		
		sq.input();
		sq.compute();
		sq.disp();
		
		ci.input();
		ci.compute();
		ci.disp();

	}

}
