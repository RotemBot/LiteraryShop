package entities;

import java.util.ArrayList;

public class Periodical extends WrittenWork {

    private Frequency frequency;

    public Periodical(String title, double price, String description, Genre genre, Frequency frequency) {
        super(title, price, description, genre);

        this.frequency = frequency;
    }

}
