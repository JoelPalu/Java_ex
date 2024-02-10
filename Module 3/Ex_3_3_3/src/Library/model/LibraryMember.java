package Library.model;

import java.util.ArrayList;

public class LibraryMember {

    private static int members = 0;
    private String name;
    private int memberID;

    private ArrayList<Book> borrowedBooks = new ArrayList<Book>();


    public LibraryMember(String name) {
        this.name = name;
        this.memberID = ++members;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }
}
