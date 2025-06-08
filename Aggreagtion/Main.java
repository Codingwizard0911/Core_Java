package Aggreagtion;

public class Main {
    public static void main(String[] args) {
        /*
         * Aggregation ==> Represents a "has-a" relationship between objects 
         * 1 object contains another object as a part of its structure 
         * but the contained objects can exist independently
         */

        Book book1 = new Book("The Fellow of the Ring", 422);
        Book book2 = new Book("The Towers", 352);

        Book[] book = { book1, book2 };

        /*for(Book books : book)
        {
            System.out.println(books.DisplayInfo());
        }*/

        Library lib = new Library("The NY", 2000, book);
        lib.show();
    }
    
}
