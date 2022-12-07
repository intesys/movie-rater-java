package it.intesys.recruting.movierater;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;

public class DatabaseConfig {

    private static Logger log = LoggerFactory.getLogger(DatabaseConfig.class);

    public static void initDbSchema() {
        log.info("Drop and CREATE database tables");

        JdbcTemplate jdbcTemplate = jdbcTemplate();
        jdbcTemplate.execute("drop table if exists movie");
        jdbcTemplate.execute("""
                CREATE TABLE movie
                   (
                       ID       INTEGER     NOT NULL PRIMARY KEY,
                       TITLE    VARCHAR(350) NOT NULL,
                       YEAR     INTEGER     NOT NULL,
                       GENRE    VARCHAR(100) NOT NULL,
                       DIRECTOR VARCHAR(100) NOT NULL,
                       ACTORS   VARCHAR(250) NOT NULL,
                       COUNTRY  VARCHAR(100) NOT NULL
                   )
        """);
    }

    public static void initDbData() {
        try {
            log.info("Populate table MOVIES");
            JdbcTemplate jdbcTemplate = jdbcTemplate();
            List<String> sqlInserts = Files.readAllLines(
                    Path.of(ClassLoader.getSystemResource("movies.sql").toURI()));
            for (String sqlInsert : sqlInserts) {
                jdbcTemplate.execute(sqlInsert);
            }
            log.info("Table MOVIES populated with {} movies", sqlInserts.size());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
    private static DataSource dataSource() {
        Properties appProperties = appProperties();
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(appProperties.getProperty("db.url"));
        hikariConfig.setUsername(appProperties.getProperty("db.user"));
        hikariConfig.setPassword(appProperties.getProperty("db.password"));
        hikariConfig.setDriverClassName(appProperties.getProperty("db.driver"));
        return new HikariDataSource(hikariConfig);
    }

    private static Properties appProperties() {

        Properties prop = new Properties();
        try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream("application.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            throw new IllegalStateException("Property load fail", ex);
        }
        return prop;
    }

}
