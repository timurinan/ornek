package finalkeyword;

public final class Staff {
	
	private String name,surname,department;

	public Staff(String name, String surname, String department) {
		super();
		this.name = name;
		this.surname = surname;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Staff [name=" + name + ", surname=" + surname + ", department=" + department + "]";
	}
	
	

}
