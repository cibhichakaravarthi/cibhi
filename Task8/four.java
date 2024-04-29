package Task8;

import java.util.Scanner;

public class four {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b,x;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("a = " +a);
		System.out.println("b= "+b);
		x=a;
		a=b;
		b=x;
		System.out.println("After swapping");
		System.out.println("a = " +a);
		System.out.println("b= "+b);
		
	}

}
