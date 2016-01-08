package entities;

import java.util.ArrayList;

public abstract class Book extends WrittenWork {


    protected String author;

    protected int pubYear;

    protected int edition;

    protected Book(String author, int pubYear, int edition, String title, double price, String description, Genre genre) {
        super(title, price, description, genre);

    }
    //getter & setter
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }



}
