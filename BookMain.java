import java.util.*;
class Publisher {
private String name;
public Publisher(String name) {
 this.name = name; // Removed "this" keyword
}
public String getName() {
 return this.name;
}
}
class Book {
private String title;
private double price;
private Publisher publisher;
public Book(String title, double price, Publisher publisher) {
 this.title = title;
 this.price = price;
 this.publisher = publisher;
}
public String getTitle() {
 return this.title;
}
public double getPrice() {
 return this.price;
}
public Publisher getPublisher() {
 return this.publisher;
}
public void display() {
 System.out.println("Title: " + this.title);
 System.out.println("Price: $" + this.price);
 System.out.println("Publisher: " + this.publisher.getName());
}
}
class Literature extends Book {
public Literature(String title, double price, Publisher publisher) {
 super(title, price, publisher);
}
}
class Fiction extends Book {
public Fiction(String title, double price, Publisher publisher) {
 super(title, price, publisher);
}
}
public class BookMain{
public static void main(String[] args) {
 Scanner r = new Scanner(System.in);
 List<Book> books = new ArrayList<>();
 Publisher publisher1 = new Publisher("Publisher A");
 Publisher publisher2 = new Publisher("Publisher B");
 books.add(new Literature("Literature Book 1", 20.99, publisher1));
 books.add(new Literature("Literature Book 2", 18.50, publisher1));
 books.add(new Fiction("Fiction Book 1", 15.75, publisher2));
 books.add(new Fiction("Fiction Book 2", 12.99, publisher2));
 System.out.println("Enter the category (Literature or Fiction): ");
 String category = r.nextLine();
 System.out.println("Books in the " + category + " category:");
 for (Book book : books) {
 if ((category.equalsIgnoreCase("Literature") && book instanceof Literature)
 || (category.equalsIgnoreCase("Fiction") && book instanceof Fiction)) {
 book.display();
 System.out.println();
 }
 }
 r.close();
}
}




// **************OUTPUT**************

/*

Enter the category (Literature or Fiction): 
Fiction
Books in the Fiction category:
Title: Fiction Book 1 
Price: $15.75
Publisher: Publisher B

Title: Fiction Book 2
Price: $12.99
Publisher: Publisher B


*/