
public class LibraryItem implements IsCrudable {
	private int pages;
	private String name;
	static int counter = 0;
	private int uniqueID;
	private String releaseDate;
	private String publisher;
	private int libraryLocation;
	private boolean available;
	
	public LibraryItem(int pages, String name, String releaseDate, String publisher,
			int libraryLocation, boolean available) {
		super();
		this.pages = pages;
		this.name = name;
		counter += 1;
		this.uniqueID = counter;
		
		this.releaseDate = releaseDate;
		this.publisher = publisher;
		this.libraryLocation = libraryLocation;
		this.available = available;
		
		
		
	
	}
	
	public int getPages() {
		return pages;
	}

	public String getName() {
		return name;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getLibraryLocation() {
		return libraryLocation;
	}

	public boolean isAvailable() {
		return available;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setLibraryLocation(int libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}


	
}
