import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    // Issues a book to a user
    public void issueBook(User user, Book book) {
        if (books.contains(book) && book.isAvailable()) {
            book.borrowBook();
            user.borrow(book);
            System.out.println(book.getTitle() + " has been issued to " + user.getName() + ".");
        } else {
            System.out.println("Cannot issue book. It is either unavailable or does not exist.");
        }
    }

    // Returns a book from a user
    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            book.returnBook();
            user.returnBook(book);
            System.out.println(book.getTitle() + " has been returned by " + user.getName() + ".");
        } else {
            System.out.println("This book was not borrowed by " + user.getName() + ".");
        }
    }

    public void listAllBooks() {
        System.out.println("\n--- All Books in the Library ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}