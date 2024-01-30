public class LibraryMain {
    public static void main(String[] args){
        Library library = new Library();

        Book b1 = new Book("Introduction to Java Programming", "John Smith", "2020");
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", "2018");
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", "2019");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);



        library.borrowBook("The Art of Fiction");

        library.displayBooks();

        library.returnBook(b3);

        library.displayBooks();
    }
}
