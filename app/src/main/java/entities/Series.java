package entities;

import java.util.*;

public class Series extends Book {

    private int length;

    private ArrayList<StandAlone> volumes = new ArrayList<>();

    public Series(String author, int pubYear, int edition, String title, double price, String description, Genre genre, int length) {
        super(author, pubYear, edition, title, price, description, genre);

        this.length = length;
        this.volumes = volumes;
    }


    /**
     * Adds a new volume as the most recent installment of the series.
     * @param newVolume The new volume to be added to the series.
     */
    public void addVolume(StandAlone newVolume) {
        volumes.add(newVolume);
    }
}
