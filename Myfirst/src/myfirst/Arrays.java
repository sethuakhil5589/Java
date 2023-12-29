package myfirst;

public class Arrays {

	public static void main(String[] args) {
		int nums1[]=new int [4];
		
		//one dimensional arrays
		for (int i=0;i<4;i++) {
			nums1[i]=(int) (Math.random()*100);
		}
		//multi-dimensional arrays
		int nums2[][]=new int[3][4];
		
		for (int j=0;j<3;j++) {
			for (int k=0;k<4;k++) {
				nums2[j][k]=(int) (Math.random()*100);
			}
		}
		
//		for (int a=0;a<4;a++) {
//			System.out.println(nums1[a]);
//		}
		
		for (int a: nums1) {
			System.out.println(a);
		}
		
		System.out.println("------------------");
		for (int b=0;b<3;b++) {
			for (int c=0;c<4;c++) {
				System.out.print(nums2[b][c]+"  ");
			}
			System.out.println();
		}
		
		for (int n[]: nums2) {
			for(int m: n) {
				System.out.println(m +" ");
			}
		}
		
		System.out.println("------***");
		
		//Jagged arrays
		int nums3[][] =new  int[3][];
		
		nums3[0]=new int[3];
		nums3[1]=new int[4];
		nums3[2]=new int[2];
		
		for (int j=0;j<nums3.length;j++) {
			for (int k=0;k<nums3[j].length;k++) {
				nums2[j][k]=(int) (Math.random()*100);
			}
			
			for (int l=0;j<nums3.length;l++) {
				for (int k=0;k<nums3[j].length;k++) {
					System.out.print(nums3[j][k]);
				}	
				System.out.println();
			
			
			
		
			for (int n[]:nums3) {
				for (int m:n) {
					System.out.print(m+ " ");
				}
				System.out.println();
			}
		}
	}

}
}
