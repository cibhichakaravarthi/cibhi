package Task10;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		r=sc.nextDouble();
		circle3 circle=new circle3(r);
		circle.setRadius(r);
		System.out.println("The circumference of the circle: "+ circle.getCircumference());

	}

}
