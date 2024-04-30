package Task9;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mark: ");
		mark=sc.nextInt();
		if(mark==100)
			System.out.println("S Grade");
		else if(mark<=99 && mark>=90)
			System.out.println("A Grade" );
		else if(mark<=89 && mark>=80)
			System.out.println("B Grade");
		else if(mark<=79 && mark>=70)
			System.out.println("C Grade");
		else if(mark<=69 && mark>=60)
			System.out.println("D Grade");
		else if(mark<=59 && mark>=50)
			System.out.println("E grade");
		else if(mark<50)
			System.out.println("F Grade");
		else if(mark<=0 || mark>=100)
			System.out.println("wrong entry");
		

	}

}
