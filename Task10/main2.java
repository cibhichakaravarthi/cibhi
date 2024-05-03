package Task10;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee2 e=new employee2(1,"Cibhi","Chakaravarthi",30000);
		System.out.printf("Yearly salary of: %d %s %s %.2f \n ",e.getID(), e.getFirstName(), e.getLastName(),e.getYearlySalary());
		System.out.println("\nAfter increment 10%\n");
		System.out.printf("yearly salary of:%d %s %s %.2f \n",e.getID(),e.getFirstName(),e.getLastName(),e.getRaiseSalary());

	}

}
