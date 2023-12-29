package myfirst;

import java.util.Objects;

class A{
	public void show() {
		System.out.println("In A show");
	}
}

class B extends A{
	public void show() {
		System.out.println("In B show");
	}
}
class C extends A{
	public void show() {
		System.out.println("In C show");
	}
}

class Laptop{
	String model;
	int price;
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}

}

class P{
	public void show() {
		System.out.println("In P show");
	}
}

class Q extends P{
	public void show1() {
		System.out.println("In Q show");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();
		
		Laptop lap= new Laptop();
		lap.model="Lenovo";
		lap.price=1000;
		Laptop lap1= new Laptop();
		lap1.model="Lenovo1";
		lap1.price=1000;
		
		boolean result = lap.equals(lap1);
		
		System.out.println(lap);
		System.out.println(result);
		
		P obj3 = new Q();
		obj3.show();
		
		Q obj4 = (Q)obj3;
		obj4.show1();
		obj4.show();
		
		
		

	}

}
