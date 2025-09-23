package com.example.uccexample.domain.dto;

public class CourtDTO {

    private int courtNumber;
    private String surface; 
    private double price;
    private boolean available;
    private Long idCourt;

    public Long getIdCourt() {
        return idCourt;
    }
    public void setIdCourt(Long idCourt) {
        this.idCourt = idCourt;
    }
    public int getCourtNumber() {
        return courtNumber;
    }
    public void setCourtNumber(int courtNumber) {
        this.courtNumber = courtNumber;
    }

    public String getSurface() {
        return surface;
    }
    public void setSurface(String surface) {
        this.surface = surface;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}