package finalkeyword;

public class Application2 {

	public static void main(String[] args) {

		HourlyPaidLecturer hourlyPaidLecturer=new HourlyPaidLecturer("Timur","Ýnan",1000);
		
		hourlyPaidLecturer.getSalary();
		
		//If the super class method is final, the objects created from subclass can use it
		//But, we can not override the final methods in the sub classes.

	}

}
