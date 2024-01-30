
public class Book {

    private String title;
    private String author;
    private String publication;
    private boolean available;
    private double rating = 0;

    private String review = "";

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


    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void addReview(String review){
        this.review += (review + "\n\n");
    }

    public String getReview() {
        return review;
    }
}