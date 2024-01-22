package library;

public class Material {

	private String genre;

	private String publisher;

	private String publish_date;

	private int id;

	private static int count = 1;

	public Material(int id) {
		super();
		this.id = id;
	}

	public Material() {
		super();
	}

	public Material(String genre, String publisher, String publish_date) {
		super();
		setGenre(genre);
		setPublisher(publisher);
		setPublish_date(publish_date);
		setId(count++);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println("Genre: " + genre);
		System.out.println("Publisher: " + publisher);
		System.out.println("Publish Date: " + publish_date);
	}

}
