import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowed = new ArrayList<>();

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBorrowed() {
        return borrowed;
    }

    public int getAge() {
        return age;
    }

    public void addBook(Book book){
        borrowed.add(book);
    }

    public void returnBook(Book book){
        borrowed.remove(book);
    }



}
