package it.intesys.recruting.movierater.tasks;

import it.intesys.recruting.movierater.DatabaseConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loggare il numero totale di film presenti nel database
 */
public class Task03_CountMovies implements Task {

    private final Logger logger = LoggerFactory.getLogger(Task03_CountMovies.class);

    @Override
    public void run() {
        DatabaseConfig.initDb();

        logger.info("In the database there are {} movies", countMovies());
    }

    public long countMovies() {
        return 0L; // todo
    }
}
