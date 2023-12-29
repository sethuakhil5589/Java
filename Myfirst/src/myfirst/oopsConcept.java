package myfirst;

class  Calculator {
	int a;
	public int additionOfValues(int a, int b) {
		int addresult=a+b;
		return addresult;
	}
	public int subOfValues(int a, int b) {
		int subresult=a-b;
		return subresult;
	}
	public int mulOfValues(int a, int b) {
		int mulresult=a*b;
		return mulresult;
	}
	public double divOfValues(int a, int b) {
		return a%b;
		
	}
	
}

public class oopsConcept {

	public static void main(String[] args) {
		int num1=10;
		int num2=12;
		
		Calculator calC= new Calculator();
		int addAnswer=calC.additionOfValues(num1, num2);
		int subAnswer=calC.subOfValues(num1, num2);
		int mulAnswer=calC.mulOfValues(num1, num2);
		double divAnswer=calC.divOfValues(num1, num2);
		
		
		System.out.println(addAnswer);
		System.out.println(subAnswer);
		System.out.println(mulAnswer);
		System.out.println(divAnswer);
	}
	


}
