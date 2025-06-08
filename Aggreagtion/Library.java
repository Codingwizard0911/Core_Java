package Aggreagtion;

public class Library {
    String Name;
    int year;

    Book[] book;

    public Library(String Name,int year,Book[] book)
    {
        this.Name = Name;
        this.year = year;
        this.book = book;
    }
    
    void show()
    {
        System.out.println(this.year + " " + this.Name);
        System.out.println("Books Available");
        for(Book books : book)
        {
            books.displayInfo();
        }
        
    }
}
