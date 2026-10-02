// 
// class must be abstract as it declares an abstract method
public abstract class Abstraction {
	...
	public abstract String getTwitterDescriptioin();// abstraction method
}

public class Book extends Abstraction {
	...
	public String getTwitterDescription() {
	  return "Book": ' "+ title + " ' by " + author;
	}
}


public static void main(String[] args) {
	Product product = new Product();
	Product product;
	product = new Book();

	System.out.println(
	  product.getTwitterDescription())
}
