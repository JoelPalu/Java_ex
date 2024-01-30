import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        System.out.println("All books: ");
        for(Book book : books){
            System.out.printf("Title: %s    Author: %s    Publication year %s\n", book.getTitle(), book.getAuthor(), book.getPublication());
        }
    }

    public void findBooksByAuthor(String author){
        System.out.printf("Books by %s:\n", author);
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                System.out.printf("Title: %s    Publication year %s\n", book.getTitle(), book.getPublication());
            }

        }
    }

}