package com.abhi.lldclass.movieBookingLLD;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        User admin=new Admin(101,"Abhirup Majumder","83349098673",new Address("station-para",743248,"Barasat"),10111);
        Customer customer=new Customer(201,"Monish","7003402129",new Address("natun-pally",700155,"Kolkata"));
        List<Slot> slotList=new ArrayList<>();
        Movie movie2=new Movie(78945,"Dhoom2","opening soon","02:56:21",Language.HINDI,199);

        slotList.add(new Slot(movie2,"12:00 pm"));
        Theatre INOX=new Theatre(10101,"INOX",new Address("Star Mall",700129,"Kolkata"),slotList);
        Movie movie=new Movie(78945,"Dhoom","opening soon","02:56:21",Language.HINDI,199);
        List<Theatre> theatreList=new ArrayList<Theatre>();
        theatreList.add(INOX);
        TheatreService theatreService=new TheatreService(theatreList);
        customer.booking(movie,INOX);
        System.out.println(customer.getBookingHistory());

    }
}
