public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // A new book is always available
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to change the book's status when it's borrowed
    public void borrowBook() {
        if (isAvailable) {
            this.isAvailable = false;
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    // Method to change the book's status when it's returned
    public void returnBook() {
        if (!isAvailable) {
            this.isAvailable = true;
        } else {
            System.out.println("This book is already available.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}