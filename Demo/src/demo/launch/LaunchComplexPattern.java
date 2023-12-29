package demo.launch;

public class LaunchComplexPattern {

	public static void main(String[] args) {
		int n=9;
		boolean B=true;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!B) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i+j==n-1 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i-j==0 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	
			System.out.println();
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!B) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i+j==n-1 && i>(n-1)/2) || (i-j==0 && i>=(n-1)/2)|| i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==0 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==n-1 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if((i+j==n-1 && i>(n-1)/2) || (i-j==0 && i>=(n-1)/2) || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
	
			System.out.println();
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==0 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i==n-1 || j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(j==n-1 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
	
			System.out.println();
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i+j==8 || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i==n-1 || i-j==0) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
	
			System.out.println();
		}

	}

}
