package Task9;

import java.util.Scanner;

public class six {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total;
		int m,d;
		float t;
		float r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month: ");
		m=sc.nextInt();
		System.out.println("Enter the number of days: ");
		d=sc.nextInt();
		System.out.println("Enter the rent: ");
		r=sc.nextInt();
		t=d*r;
		r=(float) ((r+(r*0.2))*d);
		switch(m)
		{
		case 1: total(t);
		break;
		case 2: total(t);
		break;
		case 3: total(t);
		break;
		case 4: total(r);
		break;
		case 5: total(r);
		break;
		case 6: total(r);
		break;
		case 7: total(t);
		break;
		case 8: total(t);
		break;
		case 9: total(t);
		break;
		case 10: total(t);
		break;
		case 11: total(r);
		break;
		case 12: total(r);
		break;
		default:System.out.println("Invalid input");
		break;
		
		}
		
		
	}

	private static void total(float t) {
		// TODO Auto-generated method stub
		
		System.out.println("Hotel tariff: Rs:" + t);
	}

}
