import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public boolean returnBook(Book book){
        return borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks(){
        System.out.println(name + "'s Borrowed Books:");
        for(Book book : borrowedBooks){
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Biography: " + book.getAuthor().getBiography());
            System.out.println("------------------------");
        }
    }
}