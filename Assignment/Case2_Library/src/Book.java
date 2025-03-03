

public class Book {
    // Attribute
    private String name;
    private String id;
    private Author author;

    // Constructor
    // Setter
    Book(String name, String id, Author author){
        this.name = name;
        this.id = id;
        this.author = author;
    }

    // Getter
    String getName(){
        return name;
    }

    String getId(){
        return id;
    }

    Author getAuthor(){
        return author;
    }

    void printBook(){
        System.out.println("Title: " + name);
        System.out.println("ISBN: " + id);
        System.out.println("Author: " + author.getName());
        System.out.println("Biography: " + author.getBiography());
        System.out.println("------------------------");
    }
}

/*
Title: Java Programming
ISBN: 123456789
Author: James Gosling
Biography: Creator of the Java programming language.
------------------------
 */