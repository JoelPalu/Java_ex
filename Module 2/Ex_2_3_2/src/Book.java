
public class Book {

    private String title;
    private String author;
    private String publication;
    Book(String title, String author, String publication ){
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;

    }
}