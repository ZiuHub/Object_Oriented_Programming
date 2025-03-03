import java.util.*;

public class Borrower {
    // Attribute
    List <Book> borrowedBooks = new ArrayList<>();
    private String name;

    // Constructor
    // Setter
    Borrower(String name){
        this.name = name;
    }

    // Getter
    String getName(){
        return name;
    }

    void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for(Book book : borrowedBooks){
            book.printBook();
        }
    }
}
