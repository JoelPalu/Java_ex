import Library.System.*;
import Library.model.*;

public class Main{
    public static void main(String[] args){

        Library library = new Library();

        Book book1 = new Book("The Da Vinci Code", "Dan Brown", "978-0307474278");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", "978-0062315007");
        Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0316769488");

        LibraryMember member1 = new LibraryMember("John Doe");
        LibraryMember member2 = new LibraryMember("Jane Doe");
        LibraryMember member3 = new LibraryMember("John Smith");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        System.out.println("Members in library");
        library.getMembers();

        System.out.println("\nBooks in library");
        library.getBooks();

        System.out.println("\nBooks borrowed by members");
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);
        library.borrowBook(member3, book3);

        System.out.println("\nBooks borrowed by member1");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nBooks in library");
        library.getBooks();

        System.out.println("\nBooks returned by member1");
        library.returnBook(member1, book1);

        System.out.println("\nBooks borrowed by member1");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(book.getTitle());
        }

        System.out.println("\nBooks in library");
        library.getBooks();

        System.out.println("\nAll books returned");
        library.returnBook(member2, book2);
        library.returnBook(member3, book3);

        System.out.println("\nBooks in library");
        library.getBooks();



    }
}