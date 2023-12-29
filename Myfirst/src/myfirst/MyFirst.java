package myfirst;
import java.util.*;
import java.lang.*;

public class MyFirst {

	public static void main(String[] args) {
	// While loop, Nested while loop.
		forLoop();
		
	

	}
	
	public static void whileLoop(){
		int i=1;
		
		while(i<=4) {
			System.out.println("Hii "+ i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello "+ j);
				j++;
			}
			i++;
		}
	}
	
	public static void forLoop() {
		for(int i=1;i<6;i++) {
			System.out.println("Day-"+i);
			for(int j=1;j<9;j++) {
				if(j<5) {
				System.out.println("  "+ (j+8) + "--" + (j+9));
				}
				else {
					System.out.println("   "+ (j-4) + "--" + (j-3 ));
				}
			}
		}
	}

}
