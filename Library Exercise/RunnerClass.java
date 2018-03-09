import java.io.IOException;

public class RunnerClass {

	public static void main(String[] args) throws IOException {
		PersonRegister personList = new PersonRegister();
		ItemRegister itemList = new ItemRegister();
		Person p1 = new PersonBuilder().name("Stefano").email("Stefano@silva.com").phoneNumber("07545678907").buildPerson();
		Person p2 = new PersonBuilder().name("NayStreeem").email("Nay@Streeem.com").phoneNumber("07896545342").buildPerson();
		personList.add(p1);
		personList.add(p2);
		personList.remove(p1.getPersonID());
		Book b1 = new Book(900, "Altered Carbon", "12/03/1990", "Penguin", 4567, true, "Richard Morgan", true);
		GovermentDocuments g1 = new GovermentDocuments(768, "Zero Dark Thirty", "19/04/1998", "US Goverment", 345, true, "Jane Doe", true);
		itemList.add(g1);
		itemList.add(b1);
		itemList.checkOut(b1);
		itemList.checkIn(b1);
		itemList.exportItemList();
		
		
	}

}
// to do check in check out methods, search list for available
// books, check how many copies of the books there are
//then return if they can check it out, if Y then they can etc.