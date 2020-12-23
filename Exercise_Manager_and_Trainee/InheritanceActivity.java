package manager.and.trainee;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TC #1
		Manager mng = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		mng.calculateSalary(mng.basicSalary);
		mng.calculateTransportAllowance(mng.basicSalary);
		
		//TC#2
		Trainee trn = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		trn.calculateSalary(trn.basicSalary);
		trn.calculateTransportAllowance(trn.basicSalary);
	}

}
