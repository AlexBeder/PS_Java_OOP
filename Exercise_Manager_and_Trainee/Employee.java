package manager.and.trainee;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
		public Employee (long id, String name, String address, long phone) {
			this.employeeId = id;
			this.employeeName = name;
			this.employeeAddress = address;
			this.employeePhone = phone;
		}
		
		public void calculateSalary(double basicSalary) {
			double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
			System.out.println("The salary of " + getClass().getSimpleName() + " is $" + salary);
		}
		
		public void calculateTransportAllowance(double basicSalary) {
			double transportAllowance = 10.0/100.0 * basicSalary;
			double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
			System.out.println("The salary of " + getClass().getSimpleName() + " after Transport Allowance is $" + (salary+ transportAllowance));
		}
}
