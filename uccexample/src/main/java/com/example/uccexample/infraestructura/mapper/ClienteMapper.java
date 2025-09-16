package com.example.uccexample.infraestructura.mapper;

import org.mapstruct.Mapper;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.model.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClientDTO toClientDTO(Cliente cliente);
    Cliente toCliente(ClientDTO clientDTO);
}
