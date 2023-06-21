package org.example;

import java.util.List;

public class Album {
    private int id;
    private int releaseYear;
    private String title;
    private Artist artist;
    private List<Genre> genres;

    public Album(int releaseYear, String title, Artist artist, List<Genre> genres) {
        this.releaseYear = releaseYear;
        this.title = title;
        this.artist = artist;
        this.genres = genres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public List<Genre> getGenres() {
        return genres;
    }
}
