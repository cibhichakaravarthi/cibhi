package Task9;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, num=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		rows=sc.nextInt();
		for(int i=1;i<=rows; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}

	}

}
