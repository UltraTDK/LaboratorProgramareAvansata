package com.compulsory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.compulsory.DbConnManager;

public class ArtistsDao {
    private Connection connection;

    public ArtistsDao() {
        this.connection = DbConnManager.getInstance().getConnection();
    }

    public List<Artist> getAllArtists() {
        List<Artist> artists = new ArrayList<>();
        String sql = "SELECT * FROM artists";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                artists.add(new Artist(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return artists;
    }
}
