package practicedQuestionOfAllConcept;

class Book {
    String title;
    String author;
    double price;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title:" + title);
        System.out.println("Author" + author);
        System.out.println("Price" + price);
        System.out.println("------------");
    }
}
public class Books{
    public static void main(String[] args) {
        Book b1 = new Book("The java");
        Book b2 = new Book("The Java","James");
        Book b3 = new Book("The java","James",533.2);

        System.out.println("Book Details:");
        b1.display();
        b2.display();
        b3.display();


    }
}
