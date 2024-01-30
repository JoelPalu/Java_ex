
public class Book {

    private String title;
    private String author;
    private String publication;
    private boolean available;
    Book(String title, String author, String publication ){
        this.title = title;
        this.author = author;
        this.publication = publication;
        available = true;

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

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}