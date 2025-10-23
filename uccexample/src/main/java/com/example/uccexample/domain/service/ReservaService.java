package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.infraestructura.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<ReservationDTO> getAll() {
        return reservaRepository.getAll();
    }

    public ReservationDTO findById(Long id) {
        return reservaRepository.findById(id);
    }

    public ReservationDTO save(ReservationDTO reservationDTO) {
        return reservaRepository.save(reservationDTO);
    }

    public void delete(Long id) {
        ReservationDTO reservation = reservaRepository.findById(id);
        if (reservation != null) {
            reservaRepository.delete(reservation);
        }
    }
}