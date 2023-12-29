package demo.launch;


class ABC{
	void demo() {
		System.out.println("In A class");
	}
	
	 class C{
		void demo2() {
			System.out.println("In C class");
		}
	}
}

class B extends ABC{
	void dem0() {
		System.out.println("In B class");
	}
}

public class LaunchAnonymousClass {

	public static void main(String[] args) {
		
		ABC xyz=new ABC() {
			void demo1() {
				System.out.println("In anonymous class");
			}
		};
		
//		A.C c=new A.C();
//		c.demo2();		this works when it is static
		ABC abc = new ABC();
		ABC xyz1=new ABC();
		

	}

}
