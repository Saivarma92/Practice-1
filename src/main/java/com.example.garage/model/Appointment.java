package com.example.garage.model;

import java.util.Date;

public class Appointment {
    private String vehiclePlate;
    private String mechanicName;
    private Date appointmentDate;

    // Constructor
    public Appointment(String vehiclePlate, String mechanicName, Date appointmentDate) {
        this.vehiclePlate = vehiclePlate;
        this.mechanicName = mechanicName;
        this.appointmentDate = appointmentDate;
    }

    // Getters and setters
    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}

