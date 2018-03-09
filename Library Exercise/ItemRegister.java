import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	public void exportItemList() throws IOException {
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\users\\callu\\Documents\\LibData\\libraryitems.txt"))))   {
			
			for(LibraryItem b:libraryItems)	{
		    	 switch(b.getClass().getCanonicalName()) {
		    	 case "Book":
			    	 Book book = (Book) b;
			         out.println(".........................................");
			         out.println("            LibraryBook");
			         out.println(".........................................");
			         out.println("Book ID    \t: " + book.getUniqueID());
			         out.println("Book name  \t: " + book.getName());
			         out.println("Author(s)  \t: " + book.getAuthor());
			         out.println("Release date  \t: " + book.getReleaseDate());
			         out.println("Publisher  \t: " + book.getPublisher());
			         out.println("Number of pages  \t: " + book.getPages());
			         out.println("Location in library  \t: " + book.getLibraryLocation());
			         break;
		    	 case "GovermentDocuments":
		    		 GovermentDocuments doc = (GovermentDocuments) b;
		    		 out.println(".........................................");
			         out.println("            Government Document");
			         out.println(".........................................");
			         out.println("Document ID    \t: " + doc.getUniqueID());
			         out.println("Document name  \t: " + doc.getName());
			         out.println("Author(s)  \t: " + doc.getAuthor());
			         out.println("Release date  \t: " + doc.getReleaseDate());
			         out.println("Publisher  \t: " + doc.getPublisher());
			         out.println("Number of pages  \t: " + doc.getPages());
			         out.println("Location in library  \t: " + doc.getLibraryLocation());
			         out.println("Censored true/false  \t: " + doc.isCensored());
			         break;
		    	 case "Maps":
		    		 Maps map = (Maps) b;
		    		 out.println(".........................................");
			         out.println("            Map");
			         out.println(".........................................");
			         out.println("Document ID    \t: " + map.getUniqueID());
			         out.println("Document name  \t: " + map.getName());
			         out.println("Release date  \t: " + map.getReleaseDate());
			         out.println("Publisher  \t: " + map.getPublisher());
			         out.println("Number of pages  \t: " + map.getPages());
			         out.println("Location in library  \t: " + map.getLibraryLocation());
			         out.println("Map OS Number  \t: " + map.getOsNumber());
			         out.println("Map country  \t: " + map.getCountry());
		    	 }
		    	 
			}
		     }catch (IOException e) {
		       System.out.println(e);
		    }
	}





}