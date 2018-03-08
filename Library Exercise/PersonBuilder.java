
public class PersonBuilder implements IsCrudable{

	private String name = "No specified name";
	private String email = "example@email.com";
	private String phoneNumber = "00000000000";
	
	public PersonBuilder() {}
	
	public Person buildPerson() {
		return new Person(name, email, phoneNumber);
		
	}
	 public PersonBuilder name(String _name) {
		 this.name = _name;
		 return this;
		 
	 }
	 public PersonBuilder email(String _email) {
		 this.email = _email;
		 return this;
		 
	 }
	 public PersonBuilder phoneNumber(String _phoneNumber) {
		 this.phoneNumber = _phoneNumber;
		 return this;
		 
	 }


}
