package finalkeyword;

public final class Staff {
	
	String name,surname,department;

	public Staff(String name, String surname, String department) {
		super();
		this.name = name;
		this.surname = surname;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", surname=" + surname + ", department=" + department + "]";
	}
	
	

}
