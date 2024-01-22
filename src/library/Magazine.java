package library;

public class Magazine extends Material {

	public Magazine() {
		super();
	}

	public Magazine(String genre, String publisher, String publish_date, String frequency, String media_finish) {
		super(genre, publisher, publish_date);
		this.frequency = frequency;
		this.media_finish = media_finish;
	}

	private String frequency;

	private String media_finish;

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getMedia_finish() {
		return media_finish;
	}

	public void setMedia_finish(String media_finish) {
		this.media_finish = media_finish;
	}

	@Override
	public void print() {
		super.print();
		this.getGenre();
		this.getPublisher();
		this.getPublish_date();
		this.getFrequency();
		this.getMedia_finish();
		System.out.println("Frequency: " + this.getFrequency());
		System.out.println("Media Finish: " + this.getMedia_finish());
	}

}
