package finalkeyword;

public class Lecturer {
	
	
	String name,surname;
	private double salary;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Lecturer(String name, String surname, double salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Lecturer [name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
	public final void getSalary() {
		System.out.println("The salary of the lecturer is:"+this.salary);
	}
	

}
