package Task9;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value: ");
		a=sc.nextLine();
		int n=a.length()/2;
		int count=0;
		for(int i=0; i<n;i++) {
			if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
				System.out.println("It is not palindrome");
				count++;
				break;
			}
		}
		if(count==0){
			System.out.println("It is palindrome");
			
		}

	}

}
