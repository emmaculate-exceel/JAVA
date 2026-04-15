// Customer class Declaration 
public class Customer {
	// Customer attributes
	private String lastname;
	private String firstname;
	private String sex;
	private String birthdate;

	// Customer methods
	public String getLastname() { //(public->(visiblity)) (String->(return data type)) (getLastname->(method name)) (()->(parameter list)) ({}->(begining and end of method body))
		return lastname; //return type output of the current attr value ({} -> (also a getter method))
	}

	/// Implementation of getter and setter method for the "Customer" class
	/// Getter method
	public String getLastname(String lastname) { // ({} -> (setter method)) 
		this.lastname = lastname; // change the current attr value of the parameter 

		public String getFirstname() {
		return firstname;
	}
	/// Setter method
	public String getFirstname(String Firstname){
		this.firstname = firstname;

	public String getSex() {
		return sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

}

/// The engine room
class public OnlineShop {
	public static void main(String[] args) { // start of main method
		Customer customer1 = new Customer(); // generation of customer object of the customer class
		customer1.setLastname("Likinyo");
		customer1.setFirstname("Emmanuel");

		Customer customer2 = new Customer(); // generation of new customer object of the customer class
		customer2.getLastname("Likinyo");
		customer2.getFistname("Esther");

		System.out.println(customer2.getLastname);
	}
}
