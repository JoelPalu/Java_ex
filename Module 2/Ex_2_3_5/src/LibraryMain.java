public class LibraryMain {
    public static void main(String[] args){
        Library library = new Library();

        Book b1 = new Book("Introduction to Java Programming", "John Smith", "2020");
        Book b2 = new Book("Data Structures and Algorithms", "Jane Doe", "2018");
        Book b3 = new Book("The Art of Fiction", "Alice Johnson", "2019");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);



        b1.setRating(2.5);
        b2.setRating(7.5);
        b3.setRating(3.2);
        System.out.printf("Average rating of the books: %.2f\n", library.getAverageBookRating());
        b1.addReview("asdasd");
        b2.addReview("23232weqw");
        b1.addReview("sdasdwqwe");
        b3.addReview("asdasdasd");
        System.out.printf("Most reviewed book: %s", library.getMostReviewedBook());


    }
}
