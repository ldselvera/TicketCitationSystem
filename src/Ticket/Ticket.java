/*
 * Author: Luis Selvera
 * Git/Github
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticket;

/**
 *
 * @author Selvera
 */
public class Ticket {
    private String ticket;
    private String license;
    private String permit;
    private String state;
    private String vehicle;
    private String color;
    private String violation;
    private String date;
    private String location;
    private String time;
    private String issued;
    private Boolean paid;

    public Ticket() {
    }

    public Ticket(String ticket, String license, String permit, String state, String vehicle, String color, 
                  String violationType, String date, String location, String time, String issued, Boolean paid){
        this.ticket = ticket;
        this.license = license;
        this.permit = permit;
        this.state = state;
        this.vehicle = vehicle;
        this.color = color;
        this.violation = violationType;
        this.date = date;
        this.location = location;
        this.time = time;
        this.issued = issued;
        this.paid=paid;
    }

    /**
     * @return the ticket
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the permit
     */
    public String getPermit() {
        return permit;
    }

    /**
     * @param permit the permit to set
     */
    public void setPermit(String permit) {
        this.permit = permit;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the violation
     */
    public String getViolation() {
        return violation;
    }

    /**
     * @param violation the violation to set
     */
    public void setViolation(String violation) {
        this.violation = violation;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the issued
     */
    public String getIssued() {
        return issued;
    }

    /**
     * @param issued the issued to set
     */
    public void setIssued(String issued) {
        this.issued = issued;
    }

    /**
     * @return the paid
     */
    public Boolean getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

}
