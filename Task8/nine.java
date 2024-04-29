package Task8;

import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age:");
		age=sc.nextInt();
		if(age>=60) {
			System.out.println("The person is senior citizen");
		}
		else {
			System.out.println("The person is not senior citizen");
		}


	}

}
