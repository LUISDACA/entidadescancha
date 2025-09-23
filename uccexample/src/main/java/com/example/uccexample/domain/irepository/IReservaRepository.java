package com.example.uccexample.domain.irepository;

import java.util.List;

import com.example.uccexample.domain.dto.ReservationDTO;

public interface IReservaRepository {

    List<ReservationDTO> getAll();

    ReservationDTO findById(Long id);

    ReservationDTO save(ReservationDTO reservationDTO);

    void delete(ReservationDTO reservationDTO);
}
