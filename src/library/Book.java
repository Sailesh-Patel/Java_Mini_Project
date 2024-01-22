package library;

public class Book extends Material {

	public Book() {
		super();
	}

	public Book(String genre, String publisher, String publish_date, String author, String title) {
		super(genre, publisher, publish_date);
		this.author = author;
		this.title = title;
	}

	private String author;

	private String title;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void print() {
		super.print();
		this.getGenre();
		this.getPublisher();
		this.getPublish_date();
		this.getAuthor();
		this.getTitle();
		System.out.println("Author: " + this.getAuthor());
		System.out.println("Title: " + this.getTitle());
	}

}
