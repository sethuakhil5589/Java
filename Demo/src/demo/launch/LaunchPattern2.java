package demo.launch;

public class LaunchPattern2 {

	public static void main(String[] args) {
		int n=9;
		for (int i=0; i<n ; i++) {
			for(int j=0; j<n; j++) {
				if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==3*(n-1)/2) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i==0 || i+j==n-1 || i==n-1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if((i==0 && j>0 && j<n-2 ) || (j==0 && i>0 && i<n-1 && i<n-2) || (i==n-2 && j<n-2 && j>0) || (j==n-2 && i<n-2 && i>0 && i<n-2) ||  (i-j==0 && j> ((n-1)/2)+1)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if((i==0 && i>(n-1)/2) || (j==0) || (i+j<=(n-1)/2) || (i-j>=(n-1)/2)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if((i==0 && i>(n-1)/2) || (j==0) || (i+j>=(n-1)/2) || (i-j<=(n-1)/2) || (i+j<=3*(n-1)/2) || (j-i<=(n-1)/2)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}


			System.out.println();
		}

	}

}
