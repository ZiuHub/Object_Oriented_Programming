import java.util.*;

public class Library {
    // Attribute
    private List <Book> availableBooks = new ArrayList<>();

    // Constructor
    void addBook(Book book){
        availableBooks.add(book);
        System.out.println("Book added to library: " + book.getName());
    }

    void borrowBook(Borrower borrower, Book book){
        availableBooks.remove(book);
        borrower.borrowedBooks.add(book);
        System.out.println(borrower.getName() + " borrowed: " + book.getName());
    }
    
    void returnBook(Borrower borrower, Book book){
        borrower.borrowedBooks.remove(book);
        availableBooks.add(book);
        System.out.println(borrower.getName() + " returned: " + book.getName());
    }

    void displayLibraryBooks(){
        System.out.println("Books in Library:");
        for(Book book : availableBooks){
            book.printBook();
        }
    }
}