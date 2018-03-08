import java.util.ArrayList;

public class ItemRegister implements Crud {
	public ArrayList<LibraryItem> libraryItems;
	public ItemRegister() {
		libraryItems = new ArrayList<LibraryItem>();
}
	
	public void add(IsCrudable item) {
		libraryItems.add((LibraryItem)item);	
	}
	
	public void update(IsCrudable item, int iD) {
		for ( LibraryItem i: libraryItems) {
			if(i.getUniqueID() == iD) {
				i = (LibraryItem)item;
			}
		
		}
	}
	
	public void remove(int iD) {
		int pos = -1;
		for ( LibraryItem i: libraryItems)  {
			if (i.getUniqueID() == iD) {
				pos = libraryItems.indexOf(i);
				}
			}
	
		if (pos == -1) {
			System.out.println("Item not found!");
			}
		else {
			libraryItems.remove(pos);
			}
		
		
	}

	public void checkIn(LibraryItem item) {
		item.setAvailable(true);
		}
	public void checkOut(LibraryItem item) {
		item.setAvailable(false);
	}

}