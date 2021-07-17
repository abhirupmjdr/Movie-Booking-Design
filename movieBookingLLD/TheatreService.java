package com.abhi.lldclass.movieBookingLLD;

import java.util.List;

public class TheatreService {
    private List<Theatre> theatreList;

    public TheatreService(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }

    public Theatre searchByZip(int zipCode){
        System.out.println("Searching theatre by zipCode");
        return null;
    }
    public void addTheatre(int id, String name, Address address, List<Slot> slots,Admin admin){
        if(admin.getEmployeeId()!=-1) {
            this.theatreList.add(new Theatre(id, name, address, slots));
        }
    }
    public void deleteTheatre(int id,Admin admin){
        if(admin.getEmployeeId()!=-1) {
            System.out.println("deleting Theatre of id: " + id);
        }
    }
    public void showTheatreDetails(){
        System.out.println("Showing Details of all theatre");
    }
}
