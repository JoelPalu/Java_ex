public class LibraryMain {
    public static void main(String[] args){
        Library library = new Library();
        User user = new User("Matti", 29);
        User user1 = new User("Seppo", 30);


        Book b1 = new Book("Introduction to Java Programming", "John Smith", "2020");
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", "2018");
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", "2019");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.borrowBook(b3.getTitle(), user);
        library.borrowBook(b2.getTitle(), user1);

        library.displayBooks();

        library.borrowedByUser();

        library.returnBook(b3);

        library.borrowedByUser();
        library.displayBooks();



    }
}
