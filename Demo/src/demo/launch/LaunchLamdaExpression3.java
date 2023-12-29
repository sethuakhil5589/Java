package demo.launch;

interface Printing{
	void print();
}

public class LaunchLamdaExpression3 {

	public static void main(String[] args) {
		
		Printing pr1=()->System.out.println("Hello Akhil");
		printingFromInterface(pr1);
	}
	
	static void printingFromInterface(Printing pr) {
		pr.print();
	}

}
