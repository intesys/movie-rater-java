package it.intesys.recruting.movierater;

import it.intesys.recruting.movierater.tasks.Task02_ListMoviesByYearExample;
import it.intesys.recruting.movierater.tasks.Task01_ListMoviesExample;

public class MainApplication {

    public static void main(String[] args) {
        DatabaseConfig.initDbSchema();
        DatabaseConfig.initDbData();

        new Task01_ListMoviesExample().run();
        new Task02_ListMoviesByYearExample().run();
    }
}
