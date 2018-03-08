
public class Book extends LibraryItem {

	private String author;
	private boolean series;
	
	public Book(int pages, String name, String releaseDate, String publisher, int libraryLocation,
			boolean available, String author, boolean series) {
		super(pages, name, releaseDate, publisher, libraryLocation, available);
		this.author = author;
		this.series = series;
		
	}

	public String getAuthor() {
		return author;
	}

	public boolean isSeries() {
		return series;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setSeries(boolean series) {
		this.series = series;
	}

	
}
