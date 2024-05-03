package Task10;

import java.util.Scanner;

public class main1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		int age;
		System.out.println("Enter the age:");
		age=sc.nextInt();
		person1 person =new person1(name, age);
		System.out.println(person.getName() +" is " +person.getAge() + " years old");
		

	}

}
