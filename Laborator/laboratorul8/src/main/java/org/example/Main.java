package org.example;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbConnManager connection = new DbConnManager("jdbc:oracle:thin:@localhost:1521:XE", "andrei", "andrei");
        ArtistDao artistDao = new ArtistDao(connection);
        List<Artist> artists = artistDao.getAllArtists();

        // add a new album
        Artist artist = artists.get(0);
    }
}