package com.abhi.lldclass.movieBookingLLD;

public class Slot {

    private Movie movie;
    private String time;

    public Slot(Movie movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "movie=" + movie +
                ", time='" + time + '\'' +
                '}';
    }
}
