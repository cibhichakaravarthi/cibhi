package Task8;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		for(i=1; i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);

	}

}
