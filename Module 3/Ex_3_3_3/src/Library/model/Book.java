package Library.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private LibraryMember reservedBy;

    private boolean reserved = false;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved, LibraryMember member) {
        this.reserved = reserved;
        this.reservedBy = member;
    }

    public LibraryMember getReservedBy() {
        return reservedBy;
    }
}
