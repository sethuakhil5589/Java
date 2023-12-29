package demo.launch;

public class LaunchForEachLoopArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		
		
		for(int element:arr) {
			System.out.print(element);
		}
		System.out.println();
		 int ar[][]= {{1,2,3,4},{9,8,7,6,5}};
		
		for(int Array[]:ar) {
			for(int elemen:Array) {
				System.out.print(elemen + " ");
			}
			System.out.println();
		}

	}

}
