package com.abhi.lldclass.movieBookingLLD;

public class Admin extends User{
    private int employeeId;
    public Admin(int id, String name, String phoneNumber, Address address) {
        super(id, name, phoneNumber, address);
    }

    public Admin(int id, String name, String phoneNumber, Address address, int employeeId) {
        super(id, name, phoneNumber, address);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "employeeId=" + employeeId +
                '}';
    }
}
