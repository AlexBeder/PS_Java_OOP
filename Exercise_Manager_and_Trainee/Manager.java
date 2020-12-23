package manager.and.trainee;

public class Manager extends Employee {
	
	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;
	}
	
	public void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = 15.0/100.0*basicSalary;
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		System.out.println("The salary of Manager after Transport Allowance is $" + (salary + transportAllowance));
	}

}
