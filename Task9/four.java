package Task9;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		rows=sc.nextInt();
		for( i=rows-2;i>=1; i--) {
			for( j=i;j<rows;j++) {
				System.out.print(" ");
			}
			for( j=1; j<=(2*i-1);j++) {
				if(j==1||j==(2*i-1)) {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}
		for( i=2;i<=rows-2; i++) {
			for( j=i;j<rows;j++) {
				System.out.print(" ");
			}
			for(j=1; j<=(2*i-1);j++) {
				if(j==1||j==(2*i-1)) {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}
		
			

	}

}
