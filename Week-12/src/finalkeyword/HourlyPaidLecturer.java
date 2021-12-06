package finalkeyword;

public class HourlyPaidLecturer extends Lecturer {

	public HourlyPaidLecturer(String name, String surname, double salary) {
		super(name, surname, salary);
	}
	
	/*
	 * public void getSalary() {
	 * System.out.println("The salary of the hourly paid lecturer is:"+this.salary);
	 * }
	 */

	//We can not override the final method of superclass from the subclass.
}
