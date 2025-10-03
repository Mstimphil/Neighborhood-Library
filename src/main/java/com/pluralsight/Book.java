package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOut(String name) {
        checkedOutTo = name;
        isCheckedOut = true;





    }

    public void checkIn() {
        checkedOutTo = "";
        isCheckedOut = false;


    }
    String[] books = {
            "To Kill a Mockingbird",
            "1984",
            "Pride and Prejudice",
            "The Great Gatsby",
            "The Catcher in the Rye",
            "Harry Potter and the Sorcerer's Stone",
            "The Hobbit",
            "Fahrenheit 451",
            "The Lord of the Rings",
            "Brave New World",
            "Moby Dick",
            "Jane Eyre",
            "Animal Farm",
            "The Chronicles of Narnia",
            "Wuthering Heights",
            "The Alchemist",
            "The Kite Runner",
            "The Da Vinci Code",
            "Les Misérables",
            "The Hunger Games"
    };





}

