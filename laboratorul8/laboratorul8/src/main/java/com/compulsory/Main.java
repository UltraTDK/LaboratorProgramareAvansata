package com.compulsory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArtistsDao artistDao = new ArtistsDao();
        List<Artist> artists = artistDao.getAllArtists();

        // add a new album
        Artist artist = artists.get(0);
    }
}
