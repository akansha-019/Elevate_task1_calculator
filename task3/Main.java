public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // Create and add books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        // Create and add a user
        User user1 = new User("Alice", 101);
        myLibrary.addUser(user1);

        myLibrary.listAllBooks();

        // Simulate issuing and returning a book
        myLibrary.issueBook(user1, book1);
        myLibrary.listAllBooks();
        
        myLibrary.returnBook(user1, book1);
        myLibrary.listAllBooks();
    }
}
