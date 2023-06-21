import jakarta.persistence.*;
import java.util.List;

public class Entities {
    @Entity
    public class Artist {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL)
        private List<Album> albums;

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        // getters and setters
    }

    @Entity
    public class Album {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;

        @ManyToOne
        private Artist artist;

        @ManyToMany(mappedBy = "albums", cascade = CascadeType.ALL)
        private List<Genre> genres;

        // getters and setters
    }

    @Entity
    public class Genre {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToMany(cascade = CascadeType.ALL)
        private List<Album> albums;

        // getters and setters
    }
}
