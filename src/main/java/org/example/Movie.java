package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
    /*
     *Movie is extended from TVShow and has extra attribute length.
     */
    private String length;

    public Movie() {
        super();
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "title:'"+ title + '\'' +
                ", genre:'" + genre + '\'' +
                ", year:'" + year + '\'' +
                ", length:'" + length + '\'' +
                ", rating:'" + rating + '\'' +
                ", cast:" + cast +
                '}';
    }
}
