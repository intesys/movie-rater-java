package it.intesys.recruting.movierater;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieRepository {

    private final JdbcTemplate jdbcTemplate;

    public MovieRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Movie> getAllMovies() {
        return jdbcTemplate.query(
                "SELECT ID, TITLE, YEAR, GENRE, DIRECTOR, ACTORS, COUNTRY from MOVIE",
                new BeanPropertyRowMapper<>(Movie.class));
    }

    public List<Movie> getMovieByYear(int year) {
        return jdbcTemplate.query("""
                SELECT ID,
                          TITLE,
                          YEAR,
                          GENRE,
                          DIRECTOR,
                          ACTORS,
                          COUNTRY
                   from MOVIE where YEAR = ?
                """, new Object[]{year}, new BeanPropertyRowMapper<>(Movie.class));
    }
}
