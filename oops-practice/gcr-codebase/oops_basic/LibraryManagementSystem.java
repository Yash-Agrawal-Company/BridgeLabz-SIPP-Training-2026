public class LibraryManagementSystem {
    private static String libraryName = "Central Public Library";

    private final String isbn;
    private String title;
    private String author;

    public LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails(Object obj) {
        if (obj instanceof LibraryManagementSystem) {
            LibraryManagementSystem book = (LibraryManagementSystem) obj;
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn);
        } else {
            System.out.println("Invalid Book object.");
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem.displayLibraryName();

        LibraryManagementSystem book1 = new LibraryManagementSystem("Design Patterns", "Erich Gamma", "978-0201633610");
        book1.displayDetails(book1);
    }
}