package demo.launch;

interface Square1{
	int area(int i, int j);
}

class SquareArea implements Square1{
	Square1 sq= (i,j) -> {
		int area=i*j;
		System.out.println(i*j);
		return area;
	}
	;

	@Override
	public int area(int i, int j) {
		return 0;
	}

//	public int sq(int i,int j) {
//		int area=i*j;
//		System.out.println(i*j);
//		return area;
//		
//	}
}

public class LaunchLamdaExpression {

	public static void main(String[] args) {
		SquareArea sqarea=new SquareArea();
		sqarea.sq.area(2,4);

	}

}
