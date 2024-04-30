package Task9;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,r="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=sc.nextLine();
		for(int i=a.length()-1;i>=0;i--) {
			r=r+a.charAt(i);
		}
		System.out.println("The original string: " +a);
		System.out.println("The reversed string: "+r);

	}

}
