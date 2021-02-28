package com.example.deardiary;

public class Meeting {

    private String Subject;
    private String date;
    private String description;
    private Address address;
    private String timeStart;
    private double duration ;


    public Meeting() {
    }

    public Meeting(String subject, String date, String description, Address address, String timeStart,double duration) {
        Subject = subject;
        this.date = date;
        this.description = description;
        this.address = address;
        this.timeStart = timeStart;
        this.duration = duration;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
