package demo.launch;

public class LaunchArrayAddData {

	public static void main(String[] args) {
//		int []ar=new int[5];
		int ar[][]= {{1,2,3,4,5},{3,4,5}};
		System.out.println(ar);// this will give address of the array.
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
