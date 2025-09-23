package com.example.uccexample.infraestructura.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.uccexample.domain.dto.ReservationDTO;
import com.example.uccexample.infraestructura.model.Reserva;

@Mapper(componentModel = "spring", uses = {ClienteMapper.class, CanchaMapper.class})
public interface ReservaMapper {

    // Entidad -> DTO
    @Mapping(source = "idReserva", target = "idReservation")
    @Mapping(source = "fechaInicio", target = "startDate")
    @Mapping(source = "fechaFin", target = "endDate")
    @Mapping(source = "cliente", target = "client")
    @Mapping(source = "cancha", target = "court")
    ReservationDTO toReservationDTO(Reserva reserva);

    List<ReservationDTO> toReservationDTOs(List<Reserva> reservas);

    // DTO -> Entidad
    @Mapping(source = "idReservation", target = "idReserva")
    @Mapping(source = "startDate", target = "fechaInicio")
    @Mapping(source = "endDate", target = "fechaFin")
    @Mapping(source = "client", target = "cliente")
    @Mapping(source = "court", target = "cancha")
    Reserva toReserva(ReservationDTO reservationDTO);
}
