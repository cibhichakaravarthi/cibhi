package Task8;

import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, a = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		while(num !=0) {
			num/=10;
			++a;
		}
		System.out.println("Number of digits: "+a);

	}

}
