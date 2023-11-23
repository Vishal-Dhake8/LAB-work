package parmeterized_constructor;

public class Book {

	    int id;
	    String name;
	    double price;

	    Book(int id, String name,  double price) {
	       this. id = id;
	       this. name = name;
	       this.price = price;
	    }

	    void display() {
	        System.out.println("Book ID: " + id);
	        System.out.println("Book Name: " + name);
	        System.out.println("Book Price: " + price);
	    }
	

	
	    public static void main(String[] args) {
	        Book book1 = new Book(1, "DM", 600.99);
	        Book book2 = new Book(2, "Engineering mathematics", 300.99);

	        book1.display();
	        book2.display();
	    
	}

	    }
