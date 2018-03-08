import java.util.ArrayList;

public class PersonRegister implements Crud {
	public ArrayList<Person> personList;
	public PersonRegister() {
		personList = new ArrayList<Person>();
		
		
	}
	
	public void add(IsCrudable person) {
		personList.add((Person) person);
		
	}
	
	public void remove(int iD) {
		int pos = -1;
		for ( Person p: personList)  {
			if (p.getPersonID() == iD) {
				pos = personList.indexOf(p);
				}
			}
	
		if (pos == -1) {
			System.out.println("Person not found!");
			}
		else {
			personList.remove(pos);
			}
	}
	public void update(IsCrudable person, int iD) {
		
	for ( Person p: personList) {
		if(p.getPersonID() == iD) {
			p = (Person)person;
		}
	
	}


}


		
	}


	
