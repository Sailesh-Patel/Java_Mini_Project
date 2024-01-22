package library;

public class App {

	public static void main(String[] args) {

		System.out.println("BOOKS");

		Book book1 = new Book("Horror", "Horror Pub", "1st January 2024", "Sailesh Patel", "This Scary Book");
		book1.print();
		Book book2 = new Book("Fiction", "Fiction Pub", "28th March 1997", "Some Writer", "Fiction title");
		book2.print();

		System.out.println("MAGAZINES");

		Magazine magazine1 = new Magazine("Sports", "F1 Racing", "2nd February 2023", "Monthly", "Glossy");
		magazine1.print();

		System.out.println("NEWSPAPERS");

		Newspaper newspaper1 = new Newspaper("Daily Mail", "Hard News", "22nd Janaury 2024", "Daily", "English");
		newspaper1.print();

		System.out.println("MEDIA RESOURCE");
		Media_Resource media_resource1 = new Media_Resource("Daily Mail", "Hard News", "22nd Janaury 2024",
				"115 minutes", "DVD");
		media_resource1.print();

//		Material m1 = 

	}

}
