class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Lab401 {
    public static void main(String[] args) {

        Book book1 = new Book("Clean Code", "Robert C. Martin");
        book1.displayInfo();

        Book book2 = new Book("Java Programming Basics");
        book2.displayInfo();


        Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt");
        book3.displayInfo();
    }
}