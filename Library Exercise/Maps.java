
public class Maps extends LibraryItem {
	
	private int osNumber;
	private String country;
	
	public Maps(int pages, String name, String releaseDate, String publisher, int libraryLocation,
			boolean available, int numberAvailable, int osNumber, String country) {
		super(pages, name, releaseDate, publisher, libraryLocation, available);
		this.osNumber = osNumber;
		this.country = country;
		
	}

	public int getOsNumber() {
		return osNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setOsNumber(int osNumber) {
		this.osNumber = osNumber;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
