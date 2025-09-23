package com.example.uccexample.infraestructura.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.infraestructura.model.Cliente;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    // Entidad -> DTO
    @Mapping(source = "nombre", target = "name")
    @Mapping(source = "identificacion", target = "identification")
    @Mapping(source = "telefono", target = "phone")
    @Mapping(source = "id", target = "id")  // antes idCliente
    ClientDTO toClientDTO(Cliente cliente);

    List<ClientDTO> toClientDTOs(List<Cliente> clientes);

    // DTO -> Entidad
    @Mapping(source = "name", target = "nombre")
    @Mapping(source = "identification", target = "identificacion")
    @Mapping(source = "phone", target = "telefono")
    @Mapping(source = "id", target = "id") // antes idCliente
    Cliente toCliente(ClientDTO clientDTO);

    List<Cliente> toClientes(List<ClientDTO> clientDTOs);
}