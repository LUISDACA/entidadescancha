package com.example.uccexample.infraestructura.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.model.Reserva;

@Mapper(componentModel = "spring")
public interface ReservaMapper {
    @Mapping(source = "cliente.id", target = "clienteId")
    @Mapping(source = "cancha.id", target = "canchaId")
    ReservationDTO toReservationDTO(Reserva reserva);

    @Mapping(source = "clienteId", target = "cliente.id")
    @Mapping(source = "canchaId", target = "cancha.id")
    Reserva toReserva(ReservationDTO reservationDTO);
}
