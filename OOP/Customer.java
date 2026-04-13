// Customer class Declaration 
public class Customer {
	// Customer attributes
	private String lastname;
	private String firstname;
	private String sex;
	private String birthdate;

	// Customer methods
	public String getLastname() { //(public->(visiblity)) (String->(return data type)) (getLastname->(method name)) (()->(parameter list)) ({}->(begining and end of method body))
		return lastname; // return type
	}

	public String getFirstname() {
		return firstname;
	}

	public String getSex() {
		return sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

}
