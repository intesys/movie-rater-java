package it.intesys.recruting.movierater;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Movie {

    public Movie() {
    }

    public Movie(Integer id, String title, int year, String director, String genres, String actors, String country) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.genres = Arrays.stream(genres.split(",")).map(String::trim).collect(Collectors.toSet());
        this.actors = Arrays.stream(actors.split(",")).map(String::trim).collect(Collectors.toList());
        this.country = country;
    }

    private Integer id;
    private String title;
    private int year;

    private String director;
    private Set<String> genres;
    private List<String> actors;
    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
