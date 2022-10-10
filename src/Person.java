
public class Person extends Customer {
	

	public String FirstName;
	public String LastName;
	public double NationalityNumber;
	
	public Person() {
		
		
	}
	
	public Person(int id, String city, String firstName, String lastName, double nationalityNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;
		NationalityNumber = nationalityNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getNationalityNumber() {
		return NationalityNumber;
	}

	public void setNationalityNumber(double nationalityNumber) {
		NationalityNumber = nationalityNumber;
	}

	
	
	
}


