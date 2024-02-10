package Library.System;

import Library.model.*;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    private ArrayList<LibraryMember> members = new ArrayList<LibraryMember>();

    public Library() {

    }

    public void getMembers() {
        for(LibraryMember member : members) {
            System.out.println(member.getName());
        }
    }

    public void getBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        ArrayList<Book> borrowed = member.getBorrowedBooks();
        if (books.contains(book)) {
            borrowed.add(book);
            books.remove(book);
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        ArrayList<Book> borrowed = member.getBorrowedBooks();
        if (borrowed.contains(book)) {
            books.add(book);
            borrowed.remove(book);
        }
    }
}
