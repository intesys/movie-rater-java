package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.MovieRepository;
import it.intesys.recruting.movierater.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task03_CountMoviesTest {

    @Test
    void testCountMovies() {
        var movieCount = new Task03_CountMovies(new MovieRepository(Utils.jdbcTemplate)).countMovies();
        assertEquals(10, movieCount);
    }
}
