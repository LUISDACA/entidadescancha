package com.example.uccexample.infraestructura.mapper;

import org.mapstruct.Mapper;

import com.example.uccexample.domain.dto.FieldDTO;
import com.example.uccexample.model.Cancha;

@Mapper(componentModel = "spring")
public interface CampoMapper {
    FieldDTO toFieldDTO(Cancha cancha);
    Cancha toCancha(FieldDTO fieldDTO);
}
