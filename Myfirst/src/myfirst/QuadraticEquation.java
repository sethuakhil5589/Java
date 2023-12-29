package myfirst;
import java.util.*;
import java.lang.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("Enter the values of A,B,C ");
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		double r1,r2,x;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		x=Math.sqrt((b*b)-(4*a*c));
		r1=((-b)+Math.sqrt((b*b)-(4)*(a)*(c)))/(4*(a)*(c));
		r2=((-b)-Math.sqrt((b*b)-(4)*(a)*(c)))/(4*(a)*(c));
		System.out.println("R1="+r1);
		System.out.println("R2="+r2);
		System.out.println(x);

	}

}
