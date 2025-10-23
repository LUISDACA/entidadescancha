package com.example.uccexample.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uccexample.domain.dto.ClientDTO;
import com.example.uccexample.infraestructura.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired  
    private ClienteRepository clienteRepository;

    public List<ClientDTO> obternertodo(){
        return clienteRepository.getAll();

    }
        
    public ClientDTO guardar(ClientDTO clientDto){
        return clienteRepository.save(clientDto);
    }

    public void eliminar(Long id){
        ClientDTO clientDto = clienteRepository.findById(id);
        if (clientDto != null) {
            clienteRepository.delete(clientDto);
        }
    }

    public ClientDTO findById(Long id){
        return clienteRepository.findById(id);
    }

        public ClientDTO guarda2(ClientDTO clientDto){
            ClientDTO clienteDto2 = clienteRepository.save(clientDto);
            if ("Colombiano".equals(clienteDto2.getNationality())) {
                return clienteDto2;
            }
            if ("Extranjero".equals(clienteDto2.getNationality())) {
                return clienteDto2;
            }

            return clienteDto2;
    }

}
