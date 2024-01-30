import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
//    private ArrayList<Book> borrowed = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        System.out.println("All books: ");
        for(Book book : books){
            System.out.printf("Title: %-40s    Author: %-20s    Publication year %-5s   Available: %-10b\n", book.getTitle(), book.getAuthor(), book.getPublication(), book.isAvailable());
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

    public void borrowBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                book.setAvailable(false);
                return;
            }
        }
    }

    public void returnBook(Book book){
        if(books.contains(book)){
            book.setAvailable(true);
        }
    }

    public boolean isBookAvailable(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return book.isAvailable();
            }
        }
        return false;
    }
}