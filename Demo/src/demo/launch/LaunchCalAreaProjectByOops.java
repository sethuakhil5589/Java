package demo.launch;

import java.util.Scanner;

abstract class Shape{
	float area;
	
	abstract void input();
	abstract void compute();
	abstract void disp();
}

class RectangleO extends Shape{
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

class SquareO extends Shape{
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

class CircleO extends Shape{
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

class Geometry {
	public void permit(Shape sp) {
	sp.input();
	sp.compute();
	sp.disp();
	}
}

public class LaunchCalAreaProjectByOops {

	public static void main(String[] args) {
		
		RectangleO re= new RectangleO();
		SquareO sq = new SquareO();
		CircleO ci = new CircleO();
		Geometry geo=new Geometry();
//		Shape shape;
		
		
		
		geo.permit(re);
		geo.permit(sq);
		geo.permit(ci);
		

	}

}
