package myfirst;
import java.util.*;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int sum=0;
        int l=a.length();
        int I=1;
        int V=5;
        int X=10;
        int L=50;
        int C=100;
        int D=500;
        int M=1000;
        String[] parts=a.split(",");
        int[] integerParts=new int[l];
        
        for (int j=0;j>l;j++) {
        	integerParts[j]=Integer.parseInt(a);
        }
        
        for (int i=0;i>l;i++) {
        	sum+=integerParts[i];
        	
        }
        System.out.println(sum);
        System.out.println(integerParts);
	
	}
}
