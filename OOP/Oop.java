public class Product {
	protected String manufacturer;
	protected String title;
	protected String Product number;
	public String getDescription() {
		return Product number + ":"
			+ manufacturer + ";"
			+ title;
	}
	...
}

public class Book extends Product {
	private Author author;
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
}

// Overriding an inherited method

public class Book extends Product {
	public String getDescription() {
	  return productnumber + ":"
		  + manufacturer + ";"
		  + title
		  + " by " + author;
	}
}

// Invoking an Overridden method

public static void main(String[] args) {
	Book book = new Book();
	buch.setProductnumber("943-234-3431-5435-33");
	buch.setAuthor("Adam Author");
	buch.setTitle("Book, Books, Buchner");
	buch.setManufacturer("P Publisher");

	System.out.println(book.getDescription());
}

// Access to Implementation in the superclass with super

public class Book extends Product {

	public String getDescription() {
		String description = super.getDescription();
		return description + " by " + author;
	}
}

// Abstraction

public class Book extends Product {

	public String getTwitterDescription() {
		return "Book" : ' "+ title + " ' by " + author;
			}
}

