package it.intesys.recruting.movierater;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieRepository {

    private static JdbcTemplate jdbcTemplate = DatabaseConfig.jdbcTemplate();

    public static List<Movie> getAllMovies() {
        return jdbcTemplate.query("""
                SELECT ID,
                          TITLE,
                          YEAR,
                          GENRE,
                          DIRECTOR,
                          ACTORS,
                          COUNTRY
                   from MOVIE
                """, new BeanPropertyRowMapper<>(Movie.class));
    }

    public static List<Movie> getMovieByYear(int year) {
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
