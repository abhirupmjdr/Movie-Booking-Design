package com.abhi.lldclass.movieBookingLLD;

import java.util.List;

public class Theatre {
    private int id;
    private String name;
    private Address address;
    private List<Slot> slots;

    public Theatre(int id, String name, Address address, List<Slot> slots) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.slots = slots;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", slots=" + slots +
                '}';
    }
}
