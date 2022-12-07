package it.intesys.recruting.movierater.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task03_CountMoviesTest {

    @Test
    void testCountMovies() {
        var movieCount = new Task03_CountMovies().countMovies();
        assertEquals(250, movieCount);
    }
}
