package com.example.uccexample.infraestructura.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.uccexample.domain.dto.CourtDTO;
import com.example.uccexample.infraestructura.model.Cancha;

@Mapper(componentModel = "spring")
public interface CanchaMapper {

    // Entidad -> DTO
    @Mapping(source = "idCancha", target = "idCourt")
    @Mapping(source = "numeroCancha", target = "courtNumber")
    @Mapping(source = "superficie", target = "surface")
    @Mapping(source = "precio", target = "price")
    @Mapping(source = "disponible", target = "available")
    CourtDTO toCourtDTO(Cancha cancha);


    @Mapping(source = "idCancha", target = "idCourt")
    @Mapping(source = "numeroCancha", target = "courtNumber")
    @Mapping(source = "superficie", target = "surface")
    @Mapping(source = "precio", target = "price")
    @Mapping(source = "disponible", target = "available")
    List<CourtDTO> toCourtDTOs(List<Cancha> canchas);
    // DTO -> Entidad

    @Mapping(source = "idCourt", target = "idCancha")
    @Mapping(source = "courtNumber", target = "numeroCancha")
    @Mapping(source = "surface", target = "superficie")
    @Mapping(source = "price", target = "precio")
    @Mapping(source = "available", target = "disponible")
    @Mapping(target = "reservas", ignore = true) // Evitar mapeo de relaciones
    Cancha toCancha(CourtDTO courtDTO);
}