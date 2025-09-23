package com.example.uccexample.infraestructura.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.infraestructura.crud.ReservaCrud;
import com.example.uccexample.infraestructura.mapper.ReservaMapper;
import com.example.uccexample.infraestructura.model.Reserva;

@Repository
public class ReservaRepository {

    @Autowired
    private ReservaCrud reservaCrud;

    @Autowired
    private ReservaMapper reservaMapper;

    public List<ReservationDTO> getAll() {
        List<Reserva> reservas = (List<Reserva>) reservaCrud.findAll();
        return reservas.stream().map(reservaMapper::toReservationDTO).toList();
    }

    public ReservationDTO findById(Long id) {
        Optional<Reserva> reserva = reservaCrud.findById(id);
        return reserva.map(reservaMapper::toReservationDTO).orElse(null);
    }

    public ReservationDTO save(ReservationDTO reservationDTO) {
        Reserva reserva = reservaMapper.toReserva(reservationDTO);
        return reservaMapper.toReservationDTO(reservaCrud.save(reserva));
    }

    public void delete(ReservationDTO reservationDTO) {
        Reserva reserva = reservaMapper.toReserva(reservationDTO);
        reservaCrud.delete(reserva);
    }
}
