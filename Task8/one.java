package Task8;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,p,q;
		Scanner sc= new Scanner(System.in);
		//Scanner a= new Scanner("Enter the value");
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		
		System.out.println("Enter the value of d:");
		d=sc.nextInt();
		sc.close();
		
		p=a + b;
		q=c + d;
		System.out.println("Value of p:"+ p);
		System.out.println("Value of q:"+ q);
		
		
		
		if(p>d) {
			System.out.println("sum of a and b greater than sum of c and d");
		}
		else if(p<d) {
			System.out.println("sum of a and b lesser than sum of c and d ");
		}
		else {
			System.out.println("both are equal");
		}




	}

}
