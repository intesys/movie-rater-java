package it.intesys.recruting.movierater;

import it.intesys.recruting.movierater.tasks.Task02_ListMoviesByYearExample;
import it.intesys.recruting.movierater.tasks.Task01_ListMoviesExample;
import it.intesys.recruting.movierater.tasks.Task03_CountMovies;
import it.intesys.recruting.movierater.tasks.Task04_RandomMovie;

public class MainApplication {

    public static void main(String[] args) {
        new Task01_ListMoviesExample().run();
        new Task02_ListMoviesByYearExample().run();
        new Task03_CountMovies().run();
        new Task04_RandomMovie().run();
    }
}
