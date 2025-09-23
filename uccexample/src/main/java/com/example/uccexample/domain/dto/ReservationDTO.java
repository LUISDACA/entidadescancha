package com.example.uccexample.domain.dto;

import java.time.LocalDateTime;

public class ReservationDTO {
    
    private Long idReservation;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ClientDTO client;
    private CourtDTO court; 

    public Long getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }   
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public ClientDTO getClient() {
        return client;
    }
    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public CourtDTO getCourt() {
        return court;
    }
    public void setCourt(CourtDTO court) {
        this.court = court;
    }
}
