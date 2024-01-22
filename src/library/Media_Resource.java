package library;

public class Media_Resource extends Material {

	public Media_Resource() {
		super();
	}

	public Media_Resource(String genre, String publisher, String publish_date, String length, String format) {
		super(genre, publisher, publish_date);
		this.length = length;
		this.format = format;
	}

	private String length;

	private String format;

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void print() {
		super.print();
		this.getGenre();
		this.getPublisher();
		this.getPublish_date();
		this.getLength();
		this.getFormat();
		System.out.println("Length: " + this.getLength());
		System.out.println("Format: " + this.getFormat());
	}

}
