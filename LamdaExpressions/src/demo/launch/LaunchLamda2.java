package demo.launch;

interface Area2{
	int calArea2(int i, int j); 
}

//class SquareArea2 implements Area2{
//
////	@Override
////	public int calArea2(int i, int j) {
////		int area=i*j;
////		return area;
////	}
//}

class CalSquareArea2{
	
}

public class LaunchLamda2 {

	public static void main(String[] args) {
		calculatingArea(
				 (int i, int j)-> {
					int area=i*j;
					return area;
		});
		
		}
	static void calculatingArea(Area2 square){
		
		System.out.println(square.calArea2(2, 5));

	}

}
