package Task10;

public class employee2 {
	private int id;
	private String firstName;
	private String lastName;
	private double monthlySalary;
	public employee2(int id, String fname,String lname, double msalary) {
		this.firstName=fname;
		this.id=id;
		this.lastName=lname;
		this.monthlySalary=msalary;
		if(msalary<0)
			msalary=0;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	public void setFirstName(String fname) {
		firstName=fname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lname) {
		lastName=lname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setMonthlySalary(double msalary) {
		monthlySalary=msalary;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public double getYearlySalary() {
		double yearlySalary=monthlySalary*12;
		return yearlySalary;
	}
	public double getRaiseSalary() {
		double raise=monthlySalary*0.1;
		double raiseSalary=(monthlySalary + raise)*12;
		return raiseSalary;
	}
	

}
