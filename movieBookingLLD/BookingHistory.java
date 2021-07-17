package com.abhi.lldclass.movieBookingLLD;

public class BookingHistory {
    private String dateOfBooking;
    private float price;
    private Movie movie;

    public BookingHistory(String dateOfBooking, float price, Movie movie) {
        this.dateOfBooking = dateOfBooking;
        this.price = price;
        this.movie = movie;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "BookingHistory{" +
                "dateOfBooking='" + dateOfBooking + '\'' +
                ", price=" + price +
                ", movie=" + movie +
                '}';
    }
}
