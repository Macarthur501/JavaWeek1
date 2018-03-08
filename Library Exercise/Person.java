
public class Person implements IsCrudable{
	static int counter = 0;
	private String name;
	private int personID;
	private String email;
	private String phoneNumber;
	
	public Person(String name, String email, String phoneNumber) {
		super();
		this.name = name;
		counter += 1;
		this.personID = counter;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getPersonID() {
		return personID;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}



	
}


