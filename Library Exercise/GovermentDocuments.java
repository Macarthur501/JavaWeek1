
public class GovermentDocuments extends LibraryItem {
	
	private String author;
	private boolean censored;
	
	public GovermentDocuments(int pages, String name, String releaseDate, String publisher,
			int libraryLocation, boolean available, String author, boolean censored) {
		super(pages, name, releaseDate, publisher, libraryLocation, available);
		this.author = author;
		this.censored = censored;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isCensored() {
		return censored;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCensored(boolean censored) {
		this.censored = censored;
	}

	
}
