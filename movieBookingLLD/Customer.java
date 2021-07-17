package com.abhi.lldclass.movieBookingLLD;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Customer extends User{
    private List<BookingHistory> bookingHistory=new ArrayList<>();
    public Customer(int id, String name, String phoneNumber, Address address) {
        super(id, name, phoneNumber, address);
    }

    public Customer(int id, String name, String phoneNumber, Address address, List<BookingHistory> bookingHistory) {
        super(id, name, phoneNumber, address);
        this.bookingHistory = bookingHistory;
    }

    public List<BookingHistory> getBookingHistory() {
        return bookingHistory;
    }

    public void addBookingHistory(BookingHistory bookingHistoryNew) {
        this.bookingHistory.add(bookingHistoryNew);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bookingHistory=" + bookingHistory +
                '}';
    }
    public void booking(Movie movie,Theatre theatre){
        System.out.println("Booking Movie: "+ movie
        +"in" + theatre);
        this.bookingHistory.add(new BookingHistory("09/07/2021",movie.getPrice(),movie));
    }
}
