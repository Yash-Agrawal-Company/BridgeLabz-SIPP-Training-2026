class BookItem {
    public String isbn;
    protected String title;
    private String author;

    public BookItem(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends BookItem {
    private double fileSizeMb;

    public EBook(String isbn, String title, String author, double fileSizeMb) {
        super(isbn, title, author);
        this.fileSizeMb = fileSizeMb;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN (public): " + isbn + ", Title (protected): " + title + 
                           ", Author (private via getter): " + getAuthor() + 
                           ", File Size: " + fileSizeMb + "MB");
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.2);
        ebook.displayEBookDetails();
        ebook.setAuthor("Joshua J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}