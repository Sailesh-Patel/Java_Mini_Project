package library;

public class Newspaper extends Material {

	public Newspaper() {
		super();
	}

	public Newspaper(String genre, String publisher, String publish_date, String frequency, String language) {
		super(genre, publisher, publish_date);
		this.frequency = frequency;
		this.language = language;
	}

	private String frequency;

	private String language;

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public void print() {
		super.print();
		this.getGenre();
		this.getPublisher();
		this.getPublish_date();
		this.getFrequency();
		this.getLanguage();
		System.out.println("Frequency: " + this.getFrequency());
		System.out.println("Language: " + this.getLanguage());
	}

}
