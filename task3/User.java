import java.util.ArrayList;

public class User {
    private String name;
    private int userId;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Adds a book to the user's borrowed list
    public void borrow(Book book) {
        this.borrowedBooks.add(book);
    }

    // Removes a book from the user's borrowed list
    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }
}